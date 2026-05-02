import java.util.*;

public class Graph {
    int V;
    List<List<Integer>> adj; 

    public Graph(int V) {
        this.V = V;
        adj = new ArrayList<>(); // created outer list for nodes 

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>()); // variable holds reference, new creates object
        }
    }

    // add edge
    public void addEdge(int u, int v) {
        /*here u and v are two nodes between which edge exist
        so we will get u and add v in u's array list &
        we will get v and add u in v's array list &
        */
        adj.get(u).add(v); 
        adj.get(v).add(u); // remove this line for directed graph
    }

    // print graph
    public void printGraph() {
        for (int i = 0; i < V; i++) {
            System.out.println(i + " -> " + adj.get(i));
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(5);
        
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 3);
        g.addEdge(2, 4);
        g.printGraph();
    }
}