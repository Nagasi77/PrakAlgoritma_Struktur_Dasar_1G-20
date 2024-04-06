package P7_J6.testSearching;
import java.util.Scanner;

public class bukuMainNoAbsen {
    public static void main(String[] args) { 
        Scanner s20 = new Scanner(System.in);
    
        pencarianBukuNoAbsen data = new pencarianBukuNoAbsen();
        int jumBuku = 5;

        System.out.println("====================================");
        System.out.println("Masukkan data Buku Urut dari KodeBuku Terkecil : ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("-------------------");
            System.out.print("Kode Buku : ");
            int kodeBuku = s20.nextInt();
            s20.nextLine(); 
            System.out.print("Judul buku : ");
            String judulBuku = s20.nextLine();
            System.out.print("Tahun terbit : ");
            int tahunTerbit = s20.nextInt();
            s20.nextLine(); 
            System.out.print("Pengarang : ");
            String pengarang = s20.nextLine();
            System.out.print("Stock : ");
            int stock = s20.nextInt();
            s20.nextLine(); 

            bukuNoAbsen a = new bukuNoAbsen(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(a);
        }

        System.out.println("------------------------------------");
        System.out.println("Data keseluruhan Buku : ");
        data.tampil();

        System.out.println("____________________________________");
        System.out.println("____________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan kode buku yang dicari : ");
        System.out.print("Kode Buku : ");
        int cari = s20.nextInt();
        System.out.println("menggunakan sequential Search");
        int posisi = data.FindSeqSearch(cari);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);

        bukuNoAbsen dataBuku = data.FindBuku(cari);
        dataBuku.tampilDataBuku();

        System.out.println("===================================================");
        System.out.println("menggunakan binary search");
        posisi = data.FindBinarySearch(cari, 0, jumBuku - 1);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari,posisi);
    }
}