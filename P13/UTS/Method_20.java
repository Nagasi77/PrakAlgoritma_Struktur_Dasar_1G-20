package P13.UTS;

public class Method_20 {
    private Pembeli_20 head20;
    private Pembeli_20 tail20;
    private int count20;
    private int size20;
   

    public Method_20() {
        head20 = null;
        tail20 = null;
        count20 = 0;
        size20 = 0;
    }

    public void addFirst20(int item, String b, String c) {
        Pembeli_20 newNode = new Pembeli_20(item, b, c);
        if (head20 == null) {
            head20 = newNode;
            tail20 = newNode;
        } else {
            newNode.next = head20;
            head20.prev = newNode;
            head20 = newNode;
        }
        count20++;
        size20++;
    }

    public void addLast20(int item, String b, String c) {
        Pembeli_20 newNode = new Pembeli_20(item, b, c);
        if (tail20 == null) {
            head20 = newNode;
            tail20 = newNode;
        } else {
            newNode.prev = tail20;
            tail20.next = newNode;
            tail20 = newNode;
        }
        count20++;
        size20++;
    }

    public void add20(int item, int index, String b, String c) throws Exception {
        if (isEmpty20()) {
            addFirst20(item, b, c);
        } else if (index < 0 || index > size20) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Pembeli_20 newNode = new Pembeli_20(item, b, c);
            Pembeli_20 current = head20;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            newNode.prev = current;
            newNode.next = current.next;
            current.next = newNode;
            if (newNode.next!= null) {
                newNode.next.prev = newNode;
            } else {
                tail20 = newNode;
            }
            count20++;
            size20++;
        }
    }

    public int removeFirst20() throws Exception {
        if (isEmpty20()) {
            throw new Exception("List kosong");
        }
        int item = head20.item;
        head20 = head20.next;
        if (head20!= null) {
            head20.prev = null;
        } else {
            tail20 = null;
        }
        count20--;
        size20--;
        return item;
    }

    public int removeLast20() throws Exception {
        if (isEmpty20()) {
            throw new Exception("List kosong");
        }
        int item = tail20.item;
        tail20 = tail20.prev;
        if (tail20!= null) {
            tail20.next = null;
        } else {
            head20 = null;
        }
        count20--;
        size20--;
        return item;
    }

    public int remove20(int index) throws Exception {
        if (isEmpty20()) {
            throw new Exception("List kosong");
        } else if (index < 0 || index >= size20) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Pembeli_20 current = head20;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            int item = current.item;
            current.prev.next = current.next;
            if (current.next!= null) {
                current.next.prev = current.prev;
            } else {
                tail20 = current.prev;
            }
            count20--;
            size20--;
            return item;
        }
    }

    public boolean isEmpty20() {
        return head20 == null;
    }

    public int size20() {
        return size20;
    }

    public void print20() {
        Pembeli_20 current = head20;
        int no = 1;
        System.out.println("+++++++++++++++++++++++++++++++");
            System.out.println("Daftar Antrian Resto Royal Delish");
            System.out.println("+++++++++++++++++++++++++++++++");
            System.out.println("No. | Nama Customer \t | No. Hp");
        while (current!= null) {
            System.out.println( no +"\t"+ current.item + "\t" + current.b + "\t" + current.c);
            current = current.next;
            no++;
        }
    }
    public void sortNama20(int n, names[]) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
               
                if (names[i].compareTo(names[j]) > 0) {
                   
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        System.out.println(
            "Berikut Adalah Sorting Nama: ");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }
    }
    }
