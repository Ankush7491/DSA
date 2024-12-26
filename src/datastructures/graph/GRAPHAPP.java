package datastructures.graph;

public class GRAPHAPP {
    public static void main(String[] args) {
        Graph graph=new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        System.out.println(graph.addEdge("A","B"));
        graph.printGraph();
        System.out.println(graph.removeVertex("A"));
        graph.printGraph();
    }
}
