package P15.doublelinkedlist;

public class GraphMatriks20 {
    private int[][] adjacencyMatrix;
    private int numVertices;

    public GraphMatriks20(int numVertices) {
        this.numVertices = numVertices;
        this.adjacencyMatrix = new int[numVertices][numVertices];
    }

    public void makeEdge(int src, int dest, int weight) {
        adjacencyMatrix[src][dest] = weight;
    }

    public void removeEdge(int src, int dest) {
        adjacencyMatrix[src][dest] = 0;
    }

    public void printGraph() {
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int degree(int vertex) {
        int degree = 0;
        for (int i = 0; i < numVertices; i++) {
            if (adjacencyMatrix[vertex][i] != 0) {
                degree++;
            }
            if (adjacencyMatrix[i][vertex] != 0) {
                degree++;
            }
        }
        return degree;
    }

    public int inDegree(int vertex) {
        int inDegree = 0;
        for (int i = 0; i < numVertices; i++) {
            if (adjacencyMatrix[i][vertex] != 0) {
                inDegree++;
            }
        }
        return inDegree;
    }

    public int outDegree(int vertex) {
        int outDegree = 0;
        for (int i = 0; i < numVertices; i++) {
            if (adjacencyMatrix[vertex][i] != 0) {
                outDegree++;
            }
        }
        return outDegree;
    }
}