package P9.UTS;

import java.util.Scanner;

public class MainSiswaZannur {
    static Scanner scZannur = new Scanner(System.in);
    
    public static void main(String[] args) {
        MethodsiswaZannur data = new MethodsiswaZannur();
        int jumSiswa = 6;
        boolean Zannur = true;
        System.out.println("Data kosong");
        System.out.println("======================================");
        while (Zannur == true) {
            System.out.println("Menu Data Siswa");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data Seluruhnya");
            System.out.println("3. Cari data");
            System.out.println("4. Keluar");
            System.out.println("Pilihan : ");
            int pilihan = scZannur.nextInt();
            switch (pilihan) {
                case 1: 
                System.out.println("====================================");
                System.out.println("Masukkan data Buku Urut dari NISN Terkecil : ");
                for (int i = 0; i < jumSiswa; i++) {
                System.out.println("-------------------");
                System.out.print("NISN \t: ");
                String nisnZannur = scZannur.next();
                scZannur.nextLine(); 
                System.out.print("Nama \t: ");
                String namaZannur = scZannur.nextLine(); 
                System.out.print("Alamat \t: ");
                String alamatZannur = scZannur.nextLine();
                System.out.print("Tahun \t: ");
                int tahunZannur = scZannur.nextInt();
                scZannur.nextLine();
                System.out.print("Nilai \t: ");
                double nilaiZannur = scZannur.nextDouble();
                scZannur.nextLine(); 
                
                SiswaZannur a = new SiswaZannur(nisnZannur, namaZannur, alamatZannur, tahunZannur, nilaiZannur);
                data.tambahZannur(a);
                }
                break;
                case 2:
                data.descendingDataZannur();
                data.tampilZannur();
                break;
                case 3:
                System.out.println("____________________________________");
                System.out.println("Pencarian Data : ");
                System.out.println("Masukkan NISN siswa yang dicari");
                System.out.print("NISN : ");
                String cari = scZannur.next();
                int posisi = data.binarySearchZannur(cari);
                data.TampilposisiZannur(jumSiswa, posisi);
                data.tampilDataSZannur(posisi);
                break;
                case 4:
                Zannur = false;
             }
        }
        
    }
}
