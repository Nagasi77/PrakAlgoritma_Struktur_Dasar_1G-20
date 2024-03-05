package P3;
public class limas {
    //panjang sisi alas dan tinggi
    public int PanjSiL;
    public int TingL;
    //konstruktor
    public limas(int a,int b)
    {
    PanjSiL=a;
    TingL=b;
    }

    public double volumeLim(){
        return 0.33 * Math.pow(PanjSiL, 2) * TingL; 
    }
    public double LuasPL(){
        return Math.pow(PanjSiL, 2) + (4 * (0.5 * PanjSiL * TingL));
    }
}
