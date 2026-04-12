package graph.DAG;

import java.util.ArrayList;
import java.util.List;

public class AncestorsofNodes {
    public static void dfs(int src, List<List<Integer>> adjList,boolean visited[], List<List<Integer>> res,int parent){
        visited[src] = true;
        
        for(int neighbor:adjList.get(src)){
            if(!visited[neighbor]){
                res.get(neighbor).add(parent);
                dfs(neighbor, adjList, visited, res, parent);
            }
        }

    }
    public static List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<List<Integer>> adjList = new ArrayList<>();

        for(int i =0;i<n;i++){
            adjList.add(new ArrayList<>());    
        }

        for(int edge[]:edges){
            int u = edge[0];
            int v = edge[1];

            adjList.get(u).add(v);
        }

        List<List<Integer>>  res = new ArrayList<>();
        for(int i=0;i<n;i++){
            res.add(new ArrayList<>());
        }

        for(int i=0;i<n;i++){
            boolean visited[] = new boolean[n];
            dfs(i,adjList,visited, res,i);
        }

        return res;

    }

    public static void main(String[] args) {
        AncestorsofNodes solution = new AncestorsofNodes();
        
        // Test case 1
        System.out.println("Test Case 1:");
        int n1 = 5;
        int[][] edges1 = {{0,1},{0,2},{0,3},{0,4},{1,2},{1,3},{1,4},{2,3},{2,4},{3,4}};
        List<List<Integer>> result1 = solution.getAncestors(n1, edges1);
        System.out.println("Expected: [[],[0],[0,1],[0,1,2],[0,1,2,3]]");
        System.out.print("Got:      [");
        for (int i = 0; i < result1.size(); i++) {
            System.out.print(result1.get(i));
            if (i < result1.size() - 1) System.out.print(",");
        }
        System.out.println("]");
        System.out.println();
        
        // Test case 2
        System.out.println("Test Case 2:");
        int n2 = 8;
        int[][] edges2 = {{0,3},{0,4},{1,3},{2,4},{2,7},{3,5},{3,6},{3,7},{4,6}};
        List<List<Integer>> result2 = solution.getAncestors(n2, edges2);
        System.out.println("Expected: [[],[],[],[0,1],[0,2],[0,1,3],[0,1,2,3,4],[0,1,2,3]]");
        System.out.print("Got:      [");
        for (int i = 0; i < result2.size(); i++) {
            System.out.print(result2.get(i));
            if (i < result2.size() - 1) System.out.print(",");
        }
        System.out.println("]");
    }
}
