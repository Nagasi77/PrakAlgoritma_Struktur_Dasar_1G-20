package P3;

import java.util.Scanner;

public class displayLimKerBol {
    public static int k;
    public static int t;
    public static int l;
    public static int s;
    public static int w;
    public static String pilih;
    static boolean menu = true;
    public static <Bola> void main(String[] args) {
        Scanner sc20 = new Scanner(System.in);
       //looping for insert the atribute each class
       while (menu) {
           System.out.print("\nMENU INPUT\na. Jari-jari kerucut\nb. Sisi miring kerucut\nc. Panjang sisi limas\nd. Tinggi sisi limas\ne. Jari-jari bola\nq. Quit\n [Do not capslock the word!]\n" );
           pilih = sc20.next();
            switch (pilih) {
                case "a":
                    System.out.print("Jari-jari kerucut: ");
                    k = sc20.nextInt();
                    break;
                case "b":
                    System.out.print("Sisi miring kerucut: ");
                    t = sc20.nextInt();
                    break;
                case "c":
                    System.out.print("Panjang sisi limas: ");
                    l = sc20.nextInt();
                    break;
                case "d":
                    System.out.print("Tinggi sisi limas: ");
                    s = sc20.nextInt();
                    break;
                case "e" :
                    System.out.print("Jari-jari bola: ");
                    w = sc20.nextInt();
                    break;
                case "q" :
                        System.out.print("Quiting...");
                        menu = false;
            }
       }
       
        kerucut b1 =  new kerucut(k, t);
        System.out.println("Menghitung Kerucut");
        System.out.println("Volume Kerucut adalah : "+b1.hitungVolumeK());
        System.out.println("Luas Permukaan Kerucut adalah : "+b1.hitungLuasPK());

        limas b2=new limas(l, s);
        System.out.println("Menghitung Limas");
        System.out.println("Luas Limas adalah : "+b2.LuasPL());
        System.out.println("Volume Limas adalah : "+b2.volumeLim());
        
        System.out.println("Menghitung Bola");
        bola b3=new bola(w);
        System.out.println("Luas Permukaan Bola : "+b3.luasPB());
        System.out.println("Volume Bola : "+b3.volPB());

    }
}
