package P15.doublelinkedlist;

public class Graph20 {
    int vertex;
    DoubleLinkedList list[];

    public Graph20(int numVertices) {
        list = new DoubleLinkedList[numVertices];
        for (int i = 0; i < numVertices; i++) {
            list[i] = new DoubleLinkedList();
        }
    }

    public void addEdge(int vertex1, int vertex2, int weight) {
        list[vertex1].addLast(vertex2, weight);
        list[vertex2].addLast(vertex1, weight);
    }

    public void degree(int asal) throws Exception{
        int k, totalin = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            //inDegree
            for (int j = 0; j < list[i].size; j++) {
                if (list[i].get(j) == asal) {
                    ++totalin;
                }
            }
            //Outdegree
            for (k = 0; k < list[asal].size; k++) {
                list[asal].get(k);
            }
            totalOut = k;
        }
        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + ": " + totalin);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + ": " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + (totalin + totalOut));
    }
    public void removeEdge(int asal, int tujuan) {
        try {
            list[asal].remove(tujuan);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void removeAllEdges(){
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan");
    }
    public void printGraph() throws Exception{
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.println("Gedung " + (char) ('A' + i) + " terhubung dengan ");
                int size = list[i].size();
                for (int j = 0; j < size; j++) {
                    int tujuan = list[i].get(j);
                    int jarak = list[i].getJarak(j);
                    System.out.print((char) ('A' + tujuan) + " (" + jarak + " m)");
                    if (j < size - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }
    public boolean hasPath(int vertex1, int vertex2) {
        Node current = list[vertex1].head;
        while (current!= null) {
            if (current.data == vertex2) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}
