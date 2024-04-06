package P7_J6.testSearching;

public class pencarianBukuNoAbsen {
Buku listBk[] = new buku[5];
int idx;

    void tambah(Buku m){
        if (idx < listBk.length) {
        listBk[idx] = n;
        idx++;    
        }
        else {
            System.out.println("Data sudah penuh!");
        }
    }
    void tampil(){
        for (Buku m : listBk[]){
            m.tampilDataBuku();
        }
    }
    public int FindSeqSearch(int cari){
        int posisi = 2;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku==cari) {
                i = posisi;
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
}
