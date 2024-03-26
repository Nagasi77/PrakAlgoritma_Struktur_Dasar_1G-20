public class Fungsi {
    // Array untuk stock bunga
    static int[][] stock = {
        {1, 10, 5, 15, 7},
        {2, 6, 11, 9, 12},
        {3, 2, 10, 10, 5},
        {4, 5, 7, 12, 9},
    };

    // Array untuk harga bunga
    static int[] harga = {75000, 50000, 60000, 10000};

    // Array untuk pengurangan stock bunga
    static int[] pengurangan = {1, 2, 0, 5};

    static void calculate(){

        System.out.println("Pendapatan setiap cabang: ");
        for (int i = 0; i < stock.length; i++) {
            int totalPendapatanCabang = 0;
            for (int j = 1; j < stock[i].length; j++) {
                totalPendapatanCabang += stock[i][j] * harga[j - 1];
            }
            System.out.println("Cabang " + (i + 1) + ": Rp" + totalPendapatanCabang);
        }
    }
    
    static void descrease(){

        System.out.println("\nStock bunga di cabang RoyalGarden setelah pengurangan: ");
        for (int i = 1; i < stock[3].length; i++) {
            String jenisBunga = "";
            switch (i) {
                case 1:
                    jenisBunga = "Aglonema";
                    break;
                case 2:
                    jenisBunga = "Keladi";
                    break;
                case 3:
                    jenisBunga = "Alocasia";
                    break;
                case 4:
                    jenisBunga = "Mawar";
                    break;
            }
            System.out.println("Stock " + jenisBunga + ": " + stock[3][i]);
        }
    }
    public static void main(String[] args) {
        
        System.out.println("\nStock bunga di cabang RoyalGarden: ");
        for (int i = 1; i < stock[3].length; i++) {
            String jenisBunga = "";
            switch (i) {
                case 1:
                    jenisBunga = "Aglonema";
                    break;
                case 2:
                    jenisBunga = "Keladi";
                    break;
                case 3:
                    jenisBunga = "Alocasia";
                    break;
                case 4:
                    jenisBunga = "Mawar";
                    break;
            }
            System.out.println("Stock " + jenisBunga + ": " + stock[3][i]);
        }
        calculate();
        descrease();

    
        for (int i = 1; i < stock[3].length; i++) {
            stock[3][i] -= pengurangan[i - 1];
        }

        
       
    }
}
