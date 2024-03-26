package P3;
public class contohSoal2Prcb2 {
    private String nama;
    private int umur;

    public contohSoal2Prcb2(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public static void main(String[] args) {
        contohSoal2Prcb2[][] daftarMahasiswa = new contohSoal2Prcb2[2][2];

        // Menginisialisasi array dengan objek Mahasiswa
        daftarMahasiswa[0][0] = new contohSoal2Prcb2("Andi", 20);
        daftarMahasiswa[0][1] = new contohSoal2Prcb2("Budi", 22);
        daftarMahasiswa[1][0] = new contohSoal2Prcb2("Cindy", 21);
        daftarMahasiswa[1][1] = new contohSoal2Prcb2("Dewi", 23);


        for (int i = 0; i < daftarMahasiswa.length; i++) {
            for (int j = 0; j < daftarMahasiswa[i].length; j++) {
                contohSoal2Prcb2 mahasiswa = daftarMahasiswa[i][j];
                System.out.println("Nama: " + mahasiswa.getNama() + ", Umur: " + mahasiswa.getUmur());
            }
        }
    }
}
