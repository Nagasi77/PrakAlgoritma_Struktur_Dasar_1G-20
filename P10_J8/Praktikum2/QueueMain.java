package P10_J8.Praktikum2;

import java.util.Scanner;

public class QueueMain {
    public static void menu() {
        System.out.println("Pilih menu: ");
        System.out.println("1. Antirian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Semua antrian");
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        Scanner sc20 = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc20.nextInt();
        Queue antri = new Queue(jumlah);
        int pilih;

        do {
            menu();
            pilih = sc20.nextInt();
            sc20.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("No Rekening: ");
                    String norek = sc20.nextLine();

                    System.out.print("Nama: ");
                    String nama = sc20.nextLine();

                    System.out.print("Alamat: ");
                    String alamat = sc20.nextLine();

                    System.out.print("Umur: ");
                    int umur = sc20.nextInt();

                    System.out.print("Saldo: ");
                    double saldo = sc20.nextDouble();

                    Nasabah nb = new Nasabah(norek, nama, alamat, umur, saldo);
                    sc20.nextLine();

                    antri.Enqueue(nb);

                    break;
                case 2:
                    Nasabah data = antri.Dequeue();
                    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0 && data.saldo != 0) {
                    System.out.println("Antrian yang keluar: "+data.norek + " "+ data.nama + " "+ data.alamat + " " + data.umur+ " "+ data.saldo);                        
                    }
                    break;

                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;

            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }
}
