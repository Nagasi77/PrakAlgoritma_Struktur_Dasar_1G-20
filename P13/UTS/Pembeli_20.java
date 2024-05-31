package P13.UTS;

public class Pembeli_20 {
    int item;
    String b;
    String c;
    Pembeli_20 prev;
    Pembeli_20 next;

    public Pembeli_20(int item, String b, String c) {
        this.item = item;
        this.b = b;
        this.c = c;
        this.prev = null;
        this.next = null;
    }
}
