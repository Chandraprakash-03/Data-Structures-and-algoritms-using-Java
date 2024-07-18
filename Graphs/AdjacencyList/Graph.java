package Graphs.AdjacencyList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {

    ArrayList<LinkedList<Node>> alist;

    Graph() {
        alist = new ArrayList<>();
    }

    public void addNode(Node node) {
        LinkedList<Node> currentList = new LinkedList<>();
        currentList.add(node);
        alist.add(currentList);
    }

    public void addEdge(int src, int dst) {

        LinkedList<Node> currentList = alist.get(src);
        Node dstNode = alist.get(dst).get(0);
        currentList.add(dstNode);

    }

    public boolean checkEdge(int src, int dst) {
        LinkedList<Node> currentList = alist.get(src);
        Node dstNode = alist.get(dst).get(0);
        for (Node node : currentList) {
            if (node == dstNode) {
                return true;
            }
        }
        return false;

    }

    public void print() {
        for (LinkedList<Node> linkedList : alist) {
            for (Node node : linkedList) {
                System.out.print(node.data + " -> ");
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
