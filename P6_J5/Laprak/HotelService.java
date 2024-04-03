package P6_J5.Laprak;

public class HotelService {
    Hotel [] listHtl = new Hotel[4];
    int idxHotel;
    void tambahHotel(Hotel h){
        if (idxHotel < listHtl.length ) {
            listHtl[idxHotel] = h;
            idxHotel++;
        } else {
            System.out.println("Mohon Maaf Hotel penuh!!!");
            System.out.println();
        }
    }

    void tampilAll(){
        for (Hotel h : listHtl) {
            h.tampil();
            System.out.println("--------------------");
        }
    }

    void bubbleSortHotel(){
        for (int i = 0; i < listHtl.length-1; i++) {
            for (int j = 1; j < listHtl.length-i; j++) {
             if (listHtl[j].harga < listHtl[j-1].harga ) {
                Hotel temp = listHtl[j];
                listHtl[j] = listHtl[j-1];
                listHtl[j-1] = temp;
             } 
            }
        }
    }

    void selectionSortHotel(){
        for (int i = 0; i < listHtl.length-1; i++) {
            int idxMinHotel = i;
            for (int j = i + 1; j < listHtl.length; j++) {
                if (listHtl[j].bintang > listHtl[idxMinHotel].bintang) {
                    idxMinHotel = j;
                } 
            }
            Hotel temp= listHtl[idxMinHotel];
            listHtl[idxMinHotel] = listHtl[i];
            listHtl[i] = temp;
        }
    }
}
