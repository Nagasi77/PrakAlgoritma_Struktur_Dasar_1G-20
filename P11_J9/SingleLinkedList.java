package P11_J9;

public class SingleLinkedList {
    Node head, tail;

    boolean isEmpty() { // kondisi head harus berisi null
        return head == null;
    }

    void print() { // pencetakan data ini tidak memperbolehkan LL dalam
                   // kondisi kosong
        if (!isEmpty()) {
            Node tmp = head;
            System.out.println("Isi Linked List");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List kosong");
        }
    }

    void addFirst(int input) {
        // node baru yang ditambahkan erisi data melalui parameter
        // padamethod addFirst
        Node ndInput = new Node(input, null);
        if (isEmpty()) { // kondisi jika linked list kosong
            head = ndInput; // head John tail sama dengan node input
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int input) {
        // node baru yang ditambahkan berarti data melalui parameter
        // pada method addlast
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input) {
        Node ndInput = new Node(input, null);
        Node temp = head;
        do {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp!= null);
    }

    void insertAt(int index, int input) {
        // node yang terletak di index dan node tersebut berpindah
        // satu indks setelahnya
         if (index == 0) {
            addFirst(input);
        } else {
            Node ndInput = new Node(input, head);
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
                if (temp == null) {
                    break;
                }
            }
            if (temp!= null) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
            }

        }
    }
}
