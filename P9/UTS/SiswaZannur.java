package P9.UTS;

public class SiswaZannur {
    String nisnZannur, namaZannur, alamatZannur;
    int tahunZannur;
    double nilaiZannur;

    SiswaZannur(String nisn, String nm, String almt, int thn, double nilai ) {
        nisnZannur = nisn;
        namaZannur = nm;
        alamatZannur = almt;
        tahunZannur = thn;
        nilaiZannur = nilai;
    }

    public void tampilDataSZannur(){
        System.out.println("=============================");
        System.out.println("NISN : "+ nisnZannur);
        System.out.println("Nama : " + namaZannur);
        System.out.println("Alamat : "+alamatZannur);
        System.out.println("Tahun : "+tahunZannur);
        System.out.println("Nilai : "+nilaiZannur);
    }
    public void tampilSZannur() {
        System.out.println("=============================");
        System.out.println("NISN : "+ nisnZannur);
        System.out.println("Nama : " + namaZannur);
        System.out.println("Alamat : "+alamatZannur);
        System.out.println("Tahun : "+tahunZannur);
        System.out.println("Nilai : "+nilaiZannur);
    }
   
    }

