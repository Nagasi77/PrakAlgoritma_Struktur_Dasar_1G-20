package P2;
public class bukumain20 {
  

    public static void main(String[] args) {
        
        buku20 bk1 = new buku20();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        buku20 bk2 = new buku20("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        buku20 bukuNadhif = new buku20(null, null, 0, 0, 0);
        bukuNadhif.terjual(99);
        bukuNadhif.tampilInformasi();
}
}