package P5.BruteForceDivideConq;

import java.util.Scanner;

public class Pangkat {
    public int nilai, pangkat;

     // Konstruktor untuk inisialisasi nilai dan pangkat
    public Pangkat(int nilai, int pangkat) {
        this.nilai = nilai;
        this.pangkat = pangkat;
    }

    int pangkatBF(int a, int n) {
        int hasil = 1;
        for(int i = 0; i < n; i++) {
            hasil *= a;
        }
        return hasil;
    }

    int pangkatDC(int a, int n) {
        if (n == 0) {
            return 1;
        } else if (n % 2 == 1) { // ganjil
            int temp = pangkatDC(a, (n - 1) / 2);
            return temp * temp * a;
        } else {
            int temp = pangkatDC(a, n / 2);
            return temp * temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc20 = new Scanner(System.in);
        System.out.println("=============================");
        System.out.print("Masukkan jumlah elemen yang akan dihitung: ");
        int elemen = sc20.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        for (int j = 0; j < png.length; j++) {
            System.out.println("Masukkan nilai yang hendak dipangkatkan: ");
            int nilai = sc20.nextInt();
            System.out.println("Masukkan nilai pangkat: ");
            int pangkat = sc20.nextInt();
            png[j] = new Pangkat(nilai, pangkat);
        }

        System.out.println("HASIL PANGKAT - BRUTE FORCE");
        for (int i = 0; i < png.length; i++) {
            System.out.println("Hasil dari "
                    + png[i].nilai + " pangkat "
                    + png[i].pangkat + " adalah "
                    + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }

        System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
        for (int i = 0; i < png.length; i++) {
            System.out.println("Hasil dari "
                    + png[i].nilai + " pangkat "
                    + png[i].pangkat + " adalah "
                    + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }
    }
}
