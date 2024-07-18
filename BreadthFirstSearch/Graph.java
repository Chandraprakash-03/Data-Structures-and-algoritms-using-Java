package BreadthFirstSearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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

    public void breadthFirstSearch(int src) {
        Queue<Integer> queue = new LinkedList<>();

        boolean[] visited = new boolean[matrix.length];

        queue.offer(src);
        visited[src] = true;

        while (queue.size() != 0) {
            src = queue.poll();
            System.out.println(nodes.get(src).data + "= visited");

            for (int i = 0; i < matrix[src].length; i++) {
                if (matrix[src][i] == 1 && visited[i] != true) {
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
    }

}

class Node {
    char data;

    Node(char data) {
        this.data = data;
    }
}
