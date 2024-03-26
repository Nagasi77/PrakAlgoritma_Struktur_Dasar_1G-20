import java.util.Scanner;

public class Perulangan {

    public static void main(String[] args) {
        Scanner sc20 = new Scanner(System.in);

        System.out.print("Masukkan NIM Anda: ");
        String nim = sc20.nextLine();

        int n = Integer.parseInt(nim.substring(nim.length() - 2));

        if (n < 10) {
            n += 10;
        }
        System.out.println("Maka n: "+ n);
        System.out.print("OUTPUT: ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print("* ");
            } else {
                if (i == 6 || i == 10) {
                    continue;
                }
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
