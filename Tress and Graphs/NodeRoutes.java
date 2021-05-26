import java.util.*;

public class NodeRoutes {
    private int V; // for the vertices

    // adjacency list []
    private LinkedList<Integer> adj[];

    NodeRoutes(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            // creating the sub list for the neighbours of node i
            // [[],[],[]] for v=3
            adj[i] = new LinkedList();
        }
    }

    // Function to add an edge into the graph
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    Boolean isReachable(int s, int d) {
        // to keep track of the nodes that are already visited to avoid loops
        boolean isVisited[] = new boolean[V];

        // queue for BFS
        LinkedList<Integer> queue = new LinkedList();

        // mark the current node as visited node and enqueue it
        isVisited[s] = true;
        queue.add(s);

        // now to get all the adjance vertix of s
        Iterator<Integer> i;

        while (queue.size() != 0) {
            // dequeue the element/front
            s = queue.poll();

            int n;
            // suppose we have [[1],[0,2,4],[1,3,4],[2],[1,2]] for s = o 1 is the only
            // adjacence vertix
            i = adj[s].listIterator();

            while (i.hasNext()) {
                n = i.next();
                if (n == d) {
                    return true;
                }

                if (!isVisited[n]) {
                    isVisited[n] = true;
                    queue.add(n);
                }

            }

        }
        return false;
    }

    public static void main(String args[]) {
        // Create a graph given in the above diagram
        NodeRoutes g = new NodeRoutes(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        int u = 1;
        int v = 3;
        if (g.isReachable(u, v))
            System.out.println("There is a path from " + u + " to " + v);
        else
            System.out.println("There is no path from " + u + " to " + v);
        ;

        u = 3;
        v = 1;
        if (g.isReachable(u, v))
            System.out.println("There is a path from " + u + " to " + v);
        else
            System.out.println("There is no path from " + u + " to " + v);
        ;
    }
}
