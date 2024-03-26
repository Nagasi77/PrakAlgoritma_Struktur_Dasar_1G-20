import java.util.Scanner;

/**
 * Pemilihan
 */
public class Pemilihan {
    static Scanner input20 = new Scanner(System.in);
    static double nTugas, nKuis, nUas, nUts = 0;
    static double nAkhir = 0;
    static void calculate(){
        nTugas=nTugas*20/100;
        nKuis=nKuis*20/100;
        nUts=nUts*30/100;
        nUas=nUas*30/100;
        nAkhir=nKuis+nTugas+nUas+nUts;
        System.out.println("=======================");
        if (nAkhir<=39) {
            System.out.println("Nilai akhir: "+nAkhir);
            System.out.println("Nilai huruf: E");
            System.out.println("=======================");
            System.out.println("ANDA TIDAK LULUS");
        }
        else if (nAkhir<=50){
            System.out.println("Nilai akhir: "+nAkhir);
            System.out.println("Nilai huruf: D");
            System.out.println("=======================");
            System.out.println("ANDA TIDAK LULUS");        
        }
        else if (nAkhir<=60) {
            System.out.println("Nilai akhir: "+nAkhir);
            System.out.println("Nilai huruf: C");
            System.out.println("=======================");
            System.out.println("SELAMAT ANDA LULUS");            
        }
        else if (nAkhir<=65) {
            System.out.println("Nilai akhir: "+nAkhir);
            System.out.println( "Nilai huruf: C+");
            System.out.println("=======================");
            System.out.println("SELAMAT ANDA LULUS");            
        }
        else if (nAkhir<=73) {
            System.out.println("Nilai akhir: "+nAkhir);
            System.out.println("Nilai huruf: B");
            System.out.println("=======================");
            System.out.println("=======================");
            System.out.println("SELAMAT ANDA LULUS");                  
        }
        else if (nAkhir<=80) {
            System.out.println("Nilai akhir: "+nAkhir);
            System.out.println( "Nilai huruf: B+");
            System.out.println("=======================");
            System.out.println("SELAMAT ANDA LULUS");                   
        }
        else if (nAkhir<=100) {
            System.out.println("Nilai akhir: "+nAkhir);
            System.out.println( "Nilai huruf: A");
            System.out.println("======================="); 
            System.out.println("SELAMAT ANDA LULUS");
            
        }

        
    }
    static void input(){
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("=======================");
        System.out.print("Masukkan Nilai Tugas: ");
        nTugas = input20.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        nKuis = input20.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        nUts = input20.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        nUas = input20.nextInt();
        System.out.println("=======================");
        
    }
    public static void main(String[] args) {
        while (true) {
            input();
                if (nKuis > 100||nKuis < 0||nTugas > 100||nTugas<0||nUas>100||nUas<0||nUts>100||nUts<0) {
                    System.out.println("=======================");
                    System.out.println("Nilai tidak valid!");
                    System.out.println("=======================");
                } else {
                    calculate();
                    break;
                }
            
        }
        }
    }
