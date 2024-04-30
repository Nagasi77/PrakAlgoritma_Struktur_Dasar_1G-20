package P8_J7;

public class Gudang20 {
    Barang20[] tumpukan;
    int size;
    int top;

    public Gudang20(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang20[size];
        top = -1;
}

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }
        
    public void tambahBarang(Barang20 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang "+ brg.nama + " Berhasil ditambahkan ke Gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di gudang penuh");
        }
}

    public Barang20 ambilBarang() {
        if (!cekKosong()) {
            Barang20 delete = tumpukan[top];
            top--;
            System.out.println("Barang "+ delete.nama + " diambil dari Gudang");
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public Barang20 lihatBarangTeratas() {
        if (!cekKosong()) {
            Barang20 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: "+ barangTeratas.nama); 
            return barangTeratas;           
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }
    public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gudang: ");
                for (int j = 0; j <= top; j++) {
                    System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[j].kode, tumpukan[j].nama, tumpukan[j].kategori);
                }
            
        } else {
            System.out.println("Tumpukan barang kosong");
        }
    }
}
