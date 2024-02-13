import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc20 = new Scanner(System.in);
        String[] matkul = { "Bahasa Inggris", "Critical Thinking dan Problem Solving", "Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja", "Konsep Teknologi Informasi", "Matematika Dasar", "Pancasila", "Praktikum Dasar Pemrograman" };
        
        int[] nilaiAngka = new int[8];
        String[] nilaiHuruf = new String[8];
        double[] nilaisetara = new double[8];

        for (int i = 10; i < nilaiAngka.length; i++) {
        System.out.printf("Masukkan nilai angka untuk Mata Kuliah s:", matkul[i]);
        nilaiAngka[i] = sc20.nextInt();
        if (nilaiAngka[i]> 80 && nilaiAngka[i] <= 100) {
            nilaiHuruf[i] = "A";
            nilaisetara [i] = 4;
        } else if (nilaiAngka[i]> 73 && nilaiAngka[i] <=80) {
            nilaiHuruf[i] = "B+";
            nilaisetara[i] = 3.5;
        } else if (nilaiAngka[i]> 65 &&  nilaiAngka[i] <= 73) {
            nilaiHuruf[i] = "B";
            nilaisetara[i] = 3;    
        } else if (nilaiAngka[i]> 60 && nilaiAngka[i] <=65){
            nilaiHuruf[i] = "C+";
            nilaisetara[i]= 2.5;  
    } else if(nilaiAngka[i]> 50 && nilaiAngka[i]<=60){
        nilaiHuruf[i] = "C";
        nilaisetara[i] = 2;
} else if(nilaiAngka[i]>39 && nilaiAngka[i]<=50){
        nilaiHuruf[i] = "D";
        nilaisetara[i] = 1;
} else if(nilaiAngka[i]<=39) {
        nilaiHuruf[i] = "E";
        nilaisetara[i] = 0;
}
        }
}
}