package P5_J4.BruteForceDivideConq;

import java.util.Scanner;

public class Faktorial {
    public int nilai;

    int faktorialBF_alternatif(int n) {
        int fakto = 1;
        int i = 1;
    
        do {
            fakto *= i;
            i++;
        } while (i <= n);
    
        return fakto;
    }
      
int faktorialDC(int n){
    if(n==1) {
        return 1;
    }
    else{
        int fakto = n * faktorialDC(n-1);
        return fakto;
    }
}
public static void main(String[] args) {
    Scanner sc20 = new Scanner(System.in);
    System.out.println("------------------------------");
    System.out.println("Masukkan jumlah elemen: ");
    int iJml = sc20.nextInt();

    Faktorial[] fk = new Faktorial[10];
    for (int i = 0; i < iJml; i++) {
        fk[i] = new Faktorial();
        System.out.println("Masukkan nilai data ke-" +(i+1)+": ");
        fk[i].nilai = sc20.nextInt();
    }
            System.out.println("HASIL - BRUTE FORCE");
            for (int j = 0; j < iJml; j++) {
            System.out.println("Hasil penghitungan faktorial menggunakan Brute Force adalah " + fk[j].faktorialBF_alternatif(fk[j].nilai));            
            }
            System.out.println("HASIL - DIVIDE AND CONQUER");
            for (int k = 0; k < iJml; k++) {
            System.out.println("Hasil penghitungan faktorial menggunakan Divide and Conquer adalah "+ fk[k].faktorialDC(fk[k].nilai));            
            }
}
}
