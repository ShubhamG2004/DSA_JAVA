package graph;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreathFirstSearch {
     public static class Edge{
        int src, dest, weight;

        Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph) {
        
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 4, 20));
        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 2,        10));
        graph[1].add(new Edge(1, 3, 30));
        graph[2].add(new Edge(2, 1,    10));
        graph[2].add(new Edge(2, 3, 10));

        graph[3].add(new Edge(3, 1, 30));
        graph[3].add(new Edge(3, 2, 10));
        graph[3].add(new Edge(3, 4, 60));

        graph[4].add(new Edge(4, 0, 20));
        graph[4].add(new Edge(4, 3, 60));

    }
    public static void bfs(ArrayList<Edge>[] graph){
        Queue<Integer> queue = new LinkedList<>();
        boolean[] isVisited = new boolean[graph.length];

        queue.add(0); // Start BFS from vertex 0

        while(!queue.isEmpty()){
            int curr = queue.remove();
            if(!isVisited[curr]){
                System.out.print(curr+" ");
                isVisited[curr] = true;

                for(int i=0;i<graph[curr].size();i++){
                    Edge e = graph[curr].get(i);
                    if(!isVisited[e.dest]){
                        if(!isVisited[e.dest]) {
                            queue.add(e.dest);
                        }
                    }
                }
            }
        }
    }
    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] isVisited) {
        // DFS implementation can be added here if needed

        if(isVisited[curr]) return; 

        System.out.print(curr + " ");
        isVisited[curr] = true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!isVisited[e.dest]){
                dfs(graph, e.dest, isVisited);
            }
        }
    }
    public static void main(String[] args) {
        int v = 5; // Number of vertices
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        System.out.println("BFS Traversal:");
        bfs(graph);

        boolean[] isVisited = new boolean[v];
        System.out.println();
        System.out.println("DFS Traversal:");
        dfs(graph, 0, isVisited); // Start DFS from vertex 0
        System.out.println();
    }

}
