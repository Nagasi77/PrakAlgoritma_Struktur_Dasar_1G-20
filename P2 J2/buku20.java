package P2;
public class buku20 {
    String judul, pengarang;
    int halaman, stok, harga;


void tampilInformasi() {
    System.out.println("Judul: "+ judul);
    System.out.println("Pengarang: "+ pengarang);
    System.out.println("Jumlah Halaman: "+ halaman);
    System.out.println("Sisa stok: "+ stok);
    System.out.println( "Harga Buku : Rp."+harga );
}
void terjual(int jml) {
if (stok > 0) {
    stok -= jml;
}
}
void restock(int jml) {
    stok += jml;
}
void gantiHarga(int hrg){
    harga = hrg;
}
int hitungHargaTotal(int jml){
    return jml * harga;
}
int hitungDiskon(int jml){
    double harTot = hitungHargaTotal(jml);
    double harDisk = 0;
    if (harTot > 150000) {
      harDisk = harTot * 12/100;
    }
    else if(harTot < 75000 && harTot > 150000) {
        harDisk = harTot * 5/100;
    }
    else{
        harDisk = 0;
    }

    return (int)harDisk;
}
int hitungHargaBayar(int jml){
    int hargTot2 = hitungHargaBayar(jml);
    int hargDisk = hitungDiskon(jml);
    int hargaBayar;

    hargaBayar = hargTot2 - hargDisk;
    
    return (int)hargaBayar;
}

public buku20(){

}
public buku20(String jud, String pg,int hal, int stok, int har) {
    judul = jud;
    pengarang = pg;
    this.stok = stok;
    harga = har;
}
}