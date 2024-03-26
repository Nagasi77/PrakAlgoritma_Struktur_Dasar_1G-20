package P3;
public class bola {
    public int jari2;


    //konstruktor
    public bola(int r) { 
        this.jari2 = r;  
    }

    public double luasPB(){
        return 4 * Math.PI * Math.pow(jari2, 2);
    }

    public double volPB(){
        return  4/3 * Math.PI * Math.pow(jari2, 3);
    }
    }
    


