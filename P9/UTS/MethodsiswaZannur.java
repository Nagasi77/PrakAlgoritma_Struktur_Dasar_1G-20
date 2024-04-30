package P9.UTS;

public class MethodsiswaZannur {
    SiswaZannur[] listMrdZannur = new SiswaZannur[6];
    int idx;

    void tambahZannur(SiswaZannur m){
        if (idx < listMrdZannur.length) {
        listMrdZannur[idx] = m;
        idx++;    
        }
        else {
            System.out.println("Data sudah penuh!");
        }
    }
    void tampilZannur(){ //all
        for (SiswaZannur m : listMrdZannur){
            m.tampilSZannur();
        }
}

public void tampilDataSZannur(int pos){//1
    if (pos!= -1) {
        System.out.println("nisnZannur\t : " + listMrdZannur[pos].nisnZannur);
        System.out.println("Nama\t : "+ listMrdZannur[pos].namaZannur);
        System.out.println("Alamat\t : "+ listMrdZannur[pos].alamatZannur);
        System.out.println("Tahun\t : "+ listMrdZannur[pos].tahunZannur);
        System.out.println("Nilai\t : "+ listMrdZannur[pos].nilaiZannur);
    } else {
        System.out.println("Data tidak ditemukan");
    }
}
public void TampilposisiZannur(int x, int pos){
    if (pos!= -1) {
        System.out.println("Data : "+x+" ditemukan pada indeks "+pos);
    }
    else{
        System.out.println("Data "+x+ " tidak ditemukan");
    }
}

//method descending listMrdZannur of nilai
void descendingDataZannur() {
    for (int i = 0; i < listMrdZannur.length-1; i++) {
        int idxMin = i;
        for (int j = i+1; j < listMrdZannur.length; j++) {
            if (listMrdZannur[j].nilaiZannur > listMrdZannur[idxMin].nilaiZannur) {
                idxMin = j;
            }                
        }
        //swap
        SiswaZannur tmp = listMrdZannur[idxMin];
        listMrdZannur[idxMin] = listMrdZannur[i];
        listMrdZannur[i] = tmp;
    }
}

void selectionSort() {
    for (int i = 0; i < listMrdZannur.length-1; i++) {
        int idxMin = i;
        for (int j = i+1; j < listMrdZannur.length; j++) {
            if (listMrdZannur[j].nisnZannur.compareTo(listMrdZannur[idxMin].nisnZannur)) {
                idxMin = j;
            }                
        }
        //swap
        SiswaZannur tmp = listMrdZannur[idxMin];
        listMrdZannur[idxMin] = listMrdZannur[i];
        listMrdZannur[i] = tmp;
    }
}
}
