package graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * Topological Sort using Kahn's Algorithm (BFS + indegree).
 * Steps:
 * 1) Build adjacency list and indegree array from edges.
 * 2) Push all vertices with indegree 0 into a queue.
 * 3) Pop a vertex, add it to answer, and reduce indegree of its neighbors.
 * 4) If a neighbor indegree becomes 0, push that neighbor vertex into queue.
 *
 * Important: queue stores vertex numbers (i, neighbor), not indegree values.
 * Time Complexity: O(V + E)
 * Space Complexity: O(V + E)
 */
public class TopogicalSort {
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        // Kahn's algorithm (BFS) for topological ordering.
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
        int[] inDegree = new int[V];

        for(int edge[]:edges){
            int u = edge[0];
            int v = edge[1];

            adjList.get(u).add(v);
            inDegree[v]++;
        }
        Queue<Integer> queue =new LinkedList<>();
        for(int i=0;i<V;i++){
            if(inDegree[i] == 0){
                queue.offer(i);
            }
        }
        ArrayList<Integer> res = new ArrayList<>();

        while(!queue.isEmpty()){
            int node = queue.poll();
            res.add(node);

            for(int neighbor:adjList.get(node)){
                inDegree[neighbor]--;
                if(inDegree[neighbor] == 0){
                    queue.offer(neighbor);
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        TopogicalSort solver = new TopogicalSort();

        int V1 = 4;
        int[][] edges1 = {{3, 0}, {1, 0}, {2, 0}};

        int V2 = 6;
        int[][] edges2 = {{1, 3}, {2, 3}, {4, 1}, {4, 0}, {5, 0}, {5, 2}};

        ArrayList<Integer> ans1 = solver.topoSort(V1, edges1);
        ArrayList<Integer> ans2 = solver.topoSort(V2, edges2);

        boolean valid1 = ans1.size() == V1;
        if (valid1) {
            int[] pos = new int[V1];
            for (int i = 0; i < ans1.size(); i++) {
                pos[ans1.get(i)] = i;
            }
            for (int[] e : edges1) {
                if (pos[e[0]] > pos[e[1]]) {
                    valid1 = false;
                    break;
                }
            }
        }

        boolean valid2 = ans2.size() == V2;
        if (valid2) {
            int[] pos = new int[V2];
            for (int i = 0; i < ans2.size(); i++) {
                pos[ans2.get(i)] = i;
            }
            for (int[] e : edges2) {
                if (pos[e[0]] > pos[e[1]]) {
                    valid2 = false;
                    break;
                }
            }
        }

        System.out.println("Test Case 1: " + valid1);
        System.out.println("Test Case 2: " + valid2);
    }

}
