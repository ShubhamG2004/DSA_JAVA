package graph;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DfsSearch {
    class Pair {
      int node;
      int weight;

      Pair(int var2, int var3) {
         this.node = var2;
         this.weight = var3;
      }

      public String toString() {
         return "(" + this.node + "," + this.weight + ")";
      }
   }

   /* DFS Search */
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        int n = adj.size();
        boolean[] visited = new boolean[n];
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfsOfGraph(i, visited, res, adj);
            }
        }

        return res;
    }

    public void dfsOfGraph(int node, boolean[] visited, ArrayList<Integer> res, ArrayList<ArrayList<Integer>> adj) {
        visited[node] = true;
        res.add(node);

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfsOfGraph(neighbor, visited, res, adj);
            }
        }
    }

    /* BFS Search */
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        int n = adj.size();
        boolean[] visited = new boolean[n];
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                bfsOfGraph(i, visited, res, adj);
            }
        }

        return res;
    }

    public void bfsOfGraph(int startNode, boolean[] visited, ArrayList<Integer> res, ArrayList<ArrayList<Integer>> adj) {
        Queue<Integer> queue = new LinkedList<>();
        visited[startNode] = true;
        queue.offer(startNode);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            res.add(node);

            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    queue.offer(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
    }
    public static void main(String[] args) {
        // edges with weights: {u, v, weight}
        int edges[][] = {
            {0,2,5},
            {0,1,3},
            {1,3,2}
        };
        

        int nodes = 4;
        Graph graph = new Graph(nodes);
        System.out.println("Undirected Graph");
        graph.addEdgesInListwithWeight(edges, false);
        graph.printMatrixListWeight();

        System.out.println("directed Graph");
        Graph directedGraph = new Graph(nodes);
        directedGraph.addEdgesInListwithWeight(edges, true);
        directedGraph.printMatrixListWeight();

        int[][] unweightedEdges = {
            {0, 2},
            {0, 1},
            {1, 3},
            {2,4},
        };

        int unweightedNodes = 5;
        Graph unweightedGraph = new Graph(unweightedNodes);
        unweightedGraph.addEdgesInList(unweightedEdges, false);

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < unweightedGraph.adjList.size(); i++) {
            adj.add(new ArrayList<>(unweightedGraph.adjList.get(i)));
        }

        DfsSearch search = new DfsSearch();
        ArrayList<Integer> dfsOrder = search.dfs(adj);
        System.out.println("DFS Traversal: " + dfsOrder);

        ArrayList<Integer> bfsOrder = search.bfs(adj);
        System.out.println("BFS Traversal: " + bfsOrder);
    }
}
