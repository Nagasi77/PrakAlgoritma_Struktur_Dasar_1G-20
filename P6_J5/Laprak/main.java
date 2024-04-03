package P6_J5.Laprak;

public class main {
    public static void main(String[] args) {
        HotelService list = new HotelService();
        Hotel h1 = new Hotel("Hotel Bantal Bersama", "Bandung", 40, (byte) 4);
        Hotel h2 = new Hotel("Hotel Indah", "Jakarta", 500, (byte) 5);
        Hotel h3 = new Hotel("Hotel Sejahera Satu","Malang",25, (byte) 1);
        Hotel h4 = new Hotel("Hotel null", "null", 0, (byte) 2);
        
        System.out.println("\n---[Loading List Hotel]---");
        list.tambahHotel(h1);
        list.tambahHotel(h2);
        list.tambahHotel(h3);
        list.tambahHotel(h4);

        System.out.println("\n---[List of Hotels]---");
        list.tampilAll();        

        System.out.println("\n---[Sorting the List of Hotels by Price in Ascending Order]---");
        list.bubbleSortHotel();
        list.tampilAll();

        System.out.println("\n---[Sorting the List of Hotels by Rating in Descending Order]---");
        list.selectionSortHotel();
        list.tampilAll();
    }
}


