package P8_J7;

import java.util.Scanner;

public class Postfixmain20 {
    public static void main(String[] args) {
        Scanner sc20 = new Scanner(System.in);
        String P, Q;
        System.out.println("Masukkan eksepresi matematika (infix): ");
        Q = sc20.nextLine();
        Q = Q.trim();
        Q = Q + ")";
        int total = Q.length();
        Postfix20 post = new Postfix20(total);
        P = post.konversi(Q);
        System.out.println("Postfix: "+ P);
    }
}
