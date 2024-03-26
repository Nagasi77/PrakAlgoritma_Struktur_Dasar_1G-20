import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] matkul = {
                "Bahasa Inggris",
                "Critical Thinking dan Problem Solving",
                "Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja",
                "Konsep Teknologi Informasi",
                "Matematika Dasar",
                "Pancasila",
                "Praktikum Dasar Pemrograman"
        };

        int[] nilaiAngka = new int[matkul.length];
        String[] nilaiHuruf = new String[matkul.length];
        double[] nilaiSetara = new double[matkul.length];

        for (int i = 0; i < matkul.length; i++) {
            System.out.printf("Masukkan nilai angka untuk Mata Kuliah %d: %s\n", i + 1, matkul[i]);
            nilaiAngka[i] = scanner.nextInt();

            if (nilaiAngka[i] >= 80) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4.0;
            } else if (nilaiAngka[i] >= 73) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (nilaiAngka[i] >= 65) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3.0;
            } else if (nilaiAngka[i] >= 60) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (nilaiAngka[i] >= 50) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2.0;
            } else if (nilaiAngka[i] >= 39) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0.0;
            }
        }

        // Print results (assuming you want to display them)
        System.out.println("\nHasil:");
        for (int i = 0; i < matkul.length; i++) {
            System.out.printf("%s: %d (%s - %.1f)\n", matkul[i], nilaiAngka[i], nilaiHuruf[i], nilaiSetara[i]);
        }
    }
}
