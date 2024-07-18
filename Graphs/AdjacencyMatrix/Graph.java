package Graphs.AdjacencyMatrix;

class Graph {
    int[][] matrix;

    Graph(int size) {
        matrix = new int[size][size];
    }

    public void addNode(Node node) {

    }

    public void addEdge(int src, int dst) {
        matrix[src][dst] = 1;
    }

    public boolean checkEdge(int src, int dst) {
        if (matrix[src][dst] == 1) {
            return true;
        } else {
            return false;
        }

    }

    public void print() {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

}

class Node {
    char data;

    Node(char data) {
        this.data = data;
    }
}
