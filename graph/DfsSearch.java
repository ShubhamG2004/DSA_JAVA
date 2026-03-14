package graph;

import java.util.ArrayList;

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
            {1, 3}
        };

        Graph unweightedGraph = new Graph(nodes);
        unweightedGraph.addEdgesInList(unweightedEdges, false);

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < unweightedGraph.adjList.size(); i++) {
            adj.add(new ArrayList<>(unweightedGraph.adjList.get(i)));
        }

        DfsSearch search = new DfsSearch();
        ArrayList<Integer> dfsOrder = search.dfs(adj);
        System.out.println("DFS Traversal: " + dfsOrder);
    }
}
