package P7_J6.testSearching;

public class bukuNoAbsen {
    int kodeBuku;
    String judulBuku;
    int tahunTerbit;
    String pengarang;
    int stock;

    public Buku(int kodeBuku, String judulBuku, int tahunTerbit, String pengarang, int stock) {
        kodeBuku = kodeBuku;
        judulBuku = judulBuku;
        tahunTerbit  tahunTerbit;
        pengarang = pengarang;
        stock = stock;
    }
    public void tamilDataBuku(){
        System.out.println("=============================");
        System.out.println("Kode buku : "+kodeBuku);
        System.out.println("Judul buku : " + judulBuku);
        System.out.println("Tahun terbit : "+tahunTerbit);
        System.out.println("Pengarang : "+pengarang);
        System.out.println("Stock : "+stock);
    }
}
