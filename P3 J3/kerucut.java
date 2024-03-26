package P3;
public class kerucut {
    public int jariK;
    public int siMir;

public kerucut (int r, int s) {
    jariK = r;
    siMir = s;
}
public double  hitungLuasPK() {
    return Math.PI * jariK * (siMir + jariK);
}
public double hitungVolumeK() {
    double tinggK = Math.pow(siMir, 2) - Math.pow((1/2 * jariK), 2);
    return 0.33 * Math.PI * Math.pow(jariK, 2) * tinggK;
}
}