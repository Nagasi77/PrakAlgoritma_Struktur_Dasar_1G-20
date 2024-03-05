package P3;

import java.util.Scanner;

public class Mahasiswa {
public String nama;
public String nim;
public String jenisklamin;
public double ipk;
public static int h = 0;
public static int l = 0;
public static void main(String[] args) {
    Scanner sc20 = new Scanner(System.in); 
 String arr[][] = new String[3][3];
 double arripk[] = new double[3];
while (h < 3) {
    for (int i = 0, b = 1; i < arr.length; i++, b++) {
      System.out.println("Masukkan data mahasiswa ke-"+b);
      //input data mahasiswa
      System.out.print("Masukkan nama :");
      arr[i][0] = sc20.next();
      System.out.print("Masukkan nim :");
      arr[i][1] = sc20.next();
      System.out.print("Jenis kelamin :");
      arr[i][2] = sc20.next();
    System.out.printf("Masukkan nilai IPK :");
    arripk[i]= sc20.nextDouble();
    System.out.println();
           h++;
        }
}
while (l < 3) {
    for (int k = 0, c =1 ; k < arripk.length; k++,c++) {
        System.out.println("Data mahasiswa ke-"+(c));
        System.out.println("nama : "+arr[k][0]);
        System.out.println("Nim : "+arr[k][1]);
        System.out.println("Jenis Kelamin : "+arr[k][2]);
        System.out.println("Nilai IPK : "+arripk[k]);
        l++;
    }
}
    //import method from nilaimahasiswa
    double average = nilaimahasiswa.rata2ipk(arripk);
    System.out.println("Rata-rata IPK: "+ average);
    System.out.println("Sorting IPK :");
    nilaimahasiswa.sorting(arripk);
    for (double ipk : arripk) {
        System.out.print(ipk + " ");
    }
 }
}

