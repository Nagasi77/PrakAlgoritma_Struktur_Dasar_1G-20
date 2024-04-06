package P7_J6.testSearching;
import java.util.Scanner;

public class bukuMainNoAbsen {
    public static void main(String[] args) { 
        Scanner s20 = new Scanner(System.in);
    
        pencarianBukuNoAbsen data = new pencarianBukuNoAbsen();
        int jumBuku = 5;

        System.out.println("====================================");
        System.out.println("Masukkan data Buku Urut dari KodeBuku Terkecil : ");
        for (int i = 0; i < args.length; i++) {
            System.out.println("-------------------");
            System.out.print("Kode Buku \t: ");
            int kodeBuku = s20.nextint();
        }
    }

}
