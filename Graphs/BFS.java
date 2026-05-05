import java.util.*;

public class BFS {

    public static void bfs(int start, List<List<Integer>> graph, int n) {
        boolean[] visited = new boolean[n];

        Queue<Integer> q = new ArrayDeque<>();  

        q.offer(start);
        visited[start] = true;

        while (!q.isEmpty()) {  //until me dequeue is empty
            int node = q.poll(); // source node popping and stored in node variable
            System.out.print(node + " "); 

            for (int neighbor : graph.get(node)) {
                if (!visited[neighbor]) {
                    q.offer(neighbor); //add the neighbour nodes inside the deque
                    visited[neighbor] = true; // mark the neighbour as visited previously
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = 5;

        List<List<Integer>> graph = new ArrayList<>(); /*1. Create graph in main()
                                                         2. Fill it with data
                                                         3. Pass it to bfs() */
        // It creates an empty list for each node
            for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // Graph
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(1).add(4);

        bfs(0, graph, n); 
    }
}

/*
q.offer(x);  // insert at end
q.poll();    // remove from front
q.peek();    // see front 
*/

/*
for understanding purpose we are considering two kinds of nodes
1. Source : node of which we are finding the neighbours
2. destination: neighbour node (could bemore than one)
*/