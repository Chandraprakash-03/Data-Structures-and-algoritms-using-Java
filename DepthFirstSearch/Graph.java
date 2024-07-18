package DepthFirstSearch;

import java.util.ArrayList;

class Graph {
    ArrayList<Node> nodes;
    int[][] matrix;

    Graph(int size) {
        matrix = new int[size][size];
        nodes = new ArrayList<>();
    }

    public void addNode(Node node) {

        nodes.add(node);

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

    public void depthFirstSearch(int src) {
        boolean[] visited = new boolean[matrix.length];
        dFSHelper(src, visited);
    }

    private void dFSHelper(int src, boolean[] visited) {
        if (visited[src] == true) {
            return;
        } else {
            visited[src] = true;
            System.out.println(nodes.get(src).data + "= visited");

        }
        for (int i = 0; i < matrix[src].length; i++) {
            if (matrix[src][i] == 1) {
                dFSHelper(i, visited);

            }
        }

        return;
    }

}

class Node {
    char data;

    Node(char data) {
        this.data = data;
    }
}
