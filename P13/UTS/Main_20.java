package P13.UTS;

import java.util.Scanner;

public class Main_20 {
    public static void main(String[] args) throws Exception {
        Method_20 data = new Method_20();
        Scanner scZannur = new Scanner(System.in);
     int count_20 = 1;  
     int idx20 = 6;
     String nama20, hp20;
     boolean Zannur = true;
        System.out.println("================== QUIZ 2 PRAKTIKUM ASD TI ==================");
        System.out.println("dibua oleh : Much. Zannur Nadhif");
        System.out.println("NIM : 2341720260");
        System.out.println("Absen : 20");
        System.out.println("=============================================================");
        System.out.println("Sistem Antrian Resto");
        while (Zannur == true) {
            System.out.println("Menu");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian");
            System.out.println("4. Laporan Pengurutan pesanan by nama");
            System.out.println("5. Hitung Total Pendapatan");
            System.out.println("6. Keluar");
            System.out.println("Pilih(1-5): ");
            int pilihan = scZannur.nextInt();
            switch (pilihan) {
                case 1: 
                nama20 = "null";
                hp20 = "null";
                data.add20(count_20, idx20, nama20, hp20);
                System.out.println("Nomor Antrian: "+count_20);
                System.out.print("Nama Customer : ");
                nama20 = scZannur.next();
                scZannur.nextLine(); 
                System.out.print("Nomor Hp : ");
                hp20 = scZannur.next();
                scZannur.nextLine(); 
                count_20++;
                break;
                case 2:
                data.print20();
                break;
                case 3:
                data.removeFirst20();
                break;
                case 4:
                data.sortNama20(pilihan);
                break;
                case 5:
                
                break;
                case 6:
                Zannur = false;
             }
        }
}
}