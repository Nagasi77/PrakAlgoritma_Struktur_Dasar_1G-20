package P5.BruteForceDivideConq;

import java.util.Scanner;

public class Sum {
    int elemen;
    double keuntungan[], total;

    Sum(int elemen) {
        this.elemen = elemen;
        this.keuntungan = new double[elemen];
    }

    double totalBF(double arr[]) {
        total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }
        return total;
    }

    double totalDC(double arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        }

        int mid = (l + r) / 2;
        double lsum = totalDC(arr, l, mid);
        double rsum = totalDC(arr, mid + 1, r);
        return lsum + rsum;
    }

    public static void main(String[] args) {
        Scanner sc20 = new Scanner(System.in);
        System.out.println("========================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta, Misal 5.9)");
        System.out.print("Masukkan jumlah bulan : ");
        int elm = sc20.nextInt();

        Sum sm = new Sum(elm);
        System.out.println("========================================");
        for (int i = 0; i < sm.elemen; i++) {
            System.out.println("Masukkan untung bulan ke - " + (i + 1) + " = ");
            sm.keuntungan[i] = sc20.nextDouble();
        }
        System.out.println("========================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = " + sm.totalBF(sm.keuntungan));
        System.out.println("========================================");
        System.out.println("Algoritma Divede Conquer");
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = " + sm.totalDC(sm.keuntungan, 0, elm - 1));
    }
}