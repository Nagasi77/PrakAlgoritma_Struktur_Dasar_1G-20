package P15.doublelinkedlist;

import java.util.Scanner;



public class GraphMain20 {
    public static void main(String[] args) {
        GraphMatriks20 gdg = new GraphMatriks20(4);
        gdg.makeEdge(0, 1, 50);
        gdg.makeEdge(1, 0, 60);
        gdg.makeEdge(1, 2, 70);
        gdg.makeEdge(2, 1, 80);
        gdg.makeEdge(2, 3, 40);
        gdg.makeEdge(3, 0, 90);
    
        int vertex = 0;
        System.out.println("Degree dari Gedung A: " + gdg.degree(vertex));
        System.out.println("In-degree dari Gedung A: " + gdg.inDegree(vertex));
        System.out.println("Out-degree dari Gedung A: " + gdg.outDegree(vertex));
        gdg.printGraph();
       
    }
}

