package P7_J6.testSearching;

public class bukuNoAbsen {
    int kodeBuku;
    String judulBuku;
    int tahunTerbit;
    String pengarang;
    int stock;

    bukuNoAbsen(int k, String j, int t, String p, int s) {
        kodeBuku = k;
        judulBuku = j;
        tahunTerbit = t;
        pengarang = p;
        stock = s;
    }
    public void tampilDataBuku(){
        System.out.println("=============================");
        System.out.println("Kode buku : "+kodeBuku);
        System.out.println("Judul buku : " + judulBuku);
        System.out.println("Tahun terbit : "+tahunTerbit);
        System.out.println("Pengarang : "+pengarang);
        System.out.println("Stock : "+stock);
    }
    public void TampilData() {
        System.out.println("=============================");
        System.out.println("Kode buku : "+kodeBuku);
        System.out.println("Judul buku : " + judulBuku);
        System.out.println("Tahun terbit : "+tahunTerbit);
        System.out.println("Pengarang : "+pengarang);
        System.out.println("Stock : "+stock);
    }
}
