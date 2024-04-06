package P7_J6.testSearching;

public class pencarianBukuNoAbsen {
bukuNoAbsen listBk[] = new bukuNoAbsen[5];
int idx;

    void tambah(bukuNoAbsen m){
        if (idx < listBk.length) {
        listBk[idx] = m;
        idx++;    
        }
        else {
            System.out.println("Data sudah penuh!");
        }
    }
    void tampil(){
        for (bukuNoAbsen m : listBk){
            m.tampilDataBuku();
        }
    }
    public int FindSeqSearch(int cari){
        int posisi = -1;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku==cari) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    public void Tampilposisi(int x, int pos){
        if (pos!= -1) {
            System.out.println("Data : "+x+" ditemukan pada indeks "+pos);
        }
        else{
            System.out.println("Data "+x+ " tidak ditemukan");
        }
    }
    public void TampilData(int x, int pos){
        if (pos!= -1) {
            System.out.println("Kode Buku\t : " + x);
            System.out.println("Judul\t : "+listBk[pos].judulBuku);
            System.out.println("Tahun Terbit\t : "+listBk[pos].tahunTerbit);
            System.out.println("Pengarang\t : "+listBk[pos].pengarang);
            System.out.println("Stock\t : "+listBk[pos].stock);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }

    public bukuNoAbsen FindBuku(int cari){
        bukuNoAbsen buku = null;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku == cari) {
                buku = listBk[i];
                break;
            } 
        }
        return buku;
    }

    public int FindBinarySearch(int cari, int left, int right){
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listBk[mid].kodeBuku) {
                return mid;
            } else if (cari < listBk[mid].kodeBuku) {
                return FindBinarySearch(cari, mid + 1, right); // Mencari di setengah kanan
            } else {
                return FindBinarySearch(cari, left, mid - 1); // Mencari di setengah kiri
            }
        }
        return -1;
    }
    
}
