package graph;

import java.util.ArrayList;

public class creatGraph {
    public static class Edge{
        int src, dest, weight;

        Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        int v =5;
        ArrayList<Edge>[] graph = new ArrayList[v];
        for(int i=0;i<v;i++){
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

        for(int i=0;i<graph[2].size();i++){
            Edge e = graph[2].get(i);
            System.out.println("Source: " + e.src + ", Destination: " + e.dest + ", Weight: " + e.weight);  
        }
    }
}
