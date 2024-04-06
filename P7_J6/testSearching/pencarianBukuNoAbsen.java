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
            m.tamilDataBuku();
        }
    }
    public int FindSeqSearch(int cari){
        int posisi = 0;
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
