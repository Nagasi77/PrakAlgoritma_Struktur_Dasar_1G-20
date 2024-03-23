import java.util.Scanner;

public class Album {
    public static String judul20;
    public static String penyanyi20;
    public static int jumlah20;
    public static int harga20;
    public static int a = 0;
    public static int b = 0;
    public static int c = 0;
    public static int d = 0;
    public static String arrPenyanyi20[][] = new String[5][2];
    public static int arrjumlah20[][] = new int[5][2];
    public static int kumpTotal20[][] = new int[5][2];
    
    public static void tampil20(String[][] penyanyiarr) {
       for (int i = 0; i < arrjumlah20.length; i++) {
        System.out.println("Album ke-"+i);
        System.out.println("Judul : " +arrPenyanyi20[i][0]);
        System.out.println("Artis : " +arrPenyanyi20[i][1]);
        System.out.println("Lagu  : "+arrjumlah20[i][0]+" Lagu");
        System.out.println("Harga : Rp."+arrjumlah20[i][1]);
        System.out.println();
       }
    }
    //method untuk menampilkan data terbanyak dari array kumpTotal20
    public static void cariAlbumTerlaris(int[][] kumpTotal20) {
        int max= 0;
        while (d < 5) {
            for (int i = 0; i < 5; i++) {
             if (max < kumpTotal20[i][1]) {
                 max += kumpTotal20[i][1];
             }
             else {
    
             }
             d++;
            }
        }
        System.out.println("Album Terlaris adalah yang memiliki jumlah sebesar "+max);
    }
  

    public static void daftarAlbum20(String[][] penyanyiarr) {
        for (int i = 0; i < penyanyiarr.length - 1; i++) {
            boolean isSwapped = false;
            
            for (int j =  0; j < penyanyiarr.length - i - 1; j++) {
                if (penyanyiarr[j][0].compareToIgnoreCase(penyanyiarr[j+1][0]) > 0) {
                    String temp = penyanyiarr[j][0];
                    penyanyiarr[j][0] = penyanyiarr[j+1][0];
                    penyanyiarr[j+1][0] = temp;
                    isSwapped = true;
                }
            }
        }
        
        System.out.print("Daftar Album:\n");
        for (String[] data : penyanyiarr) {
            System.out.printf("%s\n", data[0]);
        }
    }
    public static void main(String[] args) {
        Scanner sc20 = new Scanner(System.in);
        
       
            for (int i = 0; i < arrjumlah20.length; i++) {
                System.out.println("Data untuk album ke-"+i);
                System.out.print("Judul : ");
                arrPenyanyi20[i][0] = sc20.next();
                System.out.print("Nama Penyanyi : ");
                arrPenyanyi20[i][1] = sc20.next();
                System.out.print("Jumlah Lagu : ");
                arrjumlah20[i][0] = sc20.nextInt();
                System.out.print("Harga Satuan : Rp.");
                arrjumlah20[i][1] = sc20.nextInt();
                System.out.println();
                a++;
            }
            
        
        while (b < 5) {
                tampil20(arrPenyanyi20);
                b++;
            
        }
        for (int i = 0, j = 1 ; i < 5; i++, j++) {
            int total = methodAlbum.hitungPenjualan20(arrjumlah20[i][0], arrjumlah20[i][1]);
                System.out.println("Total album ke-"+j+" : "+total);
                 total += kumpTotal20[i][1];    
    }

    cariAlbumTerlaris(kumpTotal20);

    daftarAlbum20(arrPenyanyi20);
    }

}
