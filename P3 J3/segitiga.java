package P3;

public class segitiga {
    public int alas;
    public int tinggi;
    // konstruktor untuk membuat objek baru dari kelas segitiga
    public segitiga(int a, int t) {
        alas = a;
        tinggi = t;
        }
        // method yang mengembalikan luas segitiga
        public int getLuas() {
            return ((alas / 2) * tinggi);
        }
        // method mengembalikan keliling segitiga
        public int getKeliling(){
            return (int) (alas + Math.sqrt(4 * Math.pow(tinggi, 2) + Math.pow(alas, 2)));
        }
        public static void main(String[] args) {
            segitiga[]  sgArray = new segitiga[4];
            
            sgArray[0] =  new segitiga(10, 4);
            sgArray[1] =   new segitiga(15,  10);
            sgArray[2] =   new segitiga(20,  6);
            sgArray[3] =  new segitiga(25,  10);

            for (int i = 0; i < sgArray.length; i++) {
                System.out.println("Segitiga ke-"+ (i+1)+" Luas:  "+sgArray[i].getLuas()+" Keliling: "+sgArray[i].getKeliling());
            }
        }
}
