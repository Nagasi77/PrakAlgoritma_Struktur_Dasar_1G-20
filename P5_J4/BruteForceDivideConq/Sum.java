package P5_J4.BruteForceDivideConq;

import java.util.Scanner;

public class Sum {
    int elemen;
    double keuntungan[];

    Sum(int elemen) {
        this.elemen = elemen;
        this.keuntungan = new double[elemen];
    }

    double totalBF(double arr[]) {
        double total = 0;
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
        System.out.println("Berapa perusahaan yang akan dihitung : ");
        int peru = sc20.nextInt();
        int elm[] = new int[peru];
        for (int l = 0; l < peru; l++) {
            System.out.println("Program Menghitung Keuntungan Total (Satuan Juta, Misal 5.9)");
            System.out.print("Masukkan jumlah bulan Perusahaan ke- " +(l+1)+ " : ");
            elm[l] = sc20.nextInt();
        }

        for (int i = 0; i < peru; i++) {
            Sum sm = new Sum(elm[i]);
            System.out.println("========================================");
            System.out.println("Masukkan untung bulan ke-1 s/d ke-" + elm[i] +" : ");
            for (int j = 0; j < sm.elemen; j++) {
                System.out.print("Untung bulan ke-" + (j + 1) + " : ");
                sm.keuntungan[j] = sc20.nextDouble();
            }
                System.out.println("========================================");
                System.out.println("Algoritma Brute Force");
                System.out.println("Total keuntungan perusahaan ke-" +(i+1)+ " selama " + elm[i] + " bulan adalah = " + sm.totalBF(sm.keuntungan));
                System.out.println("========================================");
                System.out.println("Algoritma Divede Conquer");
                System.out.println("Total keuntungan perusahaan ke-" +(i+1)+ " selama " + elm[i] + " bulan adalah = " + sm.totalDC(sm.keuntungan, 0, elm[i] - 1));
            }
        }
    }
