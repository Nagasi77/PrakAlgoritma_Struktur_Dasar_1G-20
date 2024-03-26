package P6_J5.bubble_selection_insertion;

public class DaftarMahasiswaBerprestasi {

    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;

    // method tambah
    void tambah(Mahasiswa m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    // method tampil
    void tampil() {
        for (Mahasiswa m : listMhs) {
            m.tampil();
            System.out.println("---------------------------");
        }
    }

    // method bubbleSort
    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - 1; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    // swap
                    Mahasiswa temp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = temp;
                }
            }
        }
    }
}
