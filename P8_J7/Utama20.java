package P8_J7;

import java.util.Scanner;

public class Utama20 {
    public static void main(String[] args) {
        int ukuran = 1;
        Gudang20 Gudang = new Gudang20(ukuran);
        Scanner sc20 = new Scanner(System.in);
        boolean Nur = true;
        while (Nur == true) {
            System.out.println("\nMenu");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Tampilkan barang atas");
            System.out.println("5. Ubah kapasitas list data");
            System.out.println("6. Keluar");
            System.out.print("Pilih operasi: ");
            int pilihan = sc20.nextInt();
            sc20.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = sc20.nextInt();
                    sc20.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = sc20.nextLine();
                    System.out.print("Masukkan nama kategori: ");
                    String kategori = sc20.nextLine();
                    Barang20 barangBaru = new Barang20(kode, nama, kategori);
                    Gudang.tambahBarang(barangBaru);
                    break;
                case 2: 
                    Gudang.ambilBarang();
                    break;
                case 3:
                    Gudang.tampilkanBarang();
                    break;
                case 4:
                    Gudang.lihatBarangTeratas();
                    break;
                case 5:
                    System.out.print("Ubah kapasitas menjadi : ");
                    ukuran = sc20.nextInt();
                    break;
                case 6:
                    Nur = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silahkan coba lagi");;
            }
        }

    }
    
}
