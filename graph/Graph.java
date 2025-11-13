package graph;

import java.util.ArrayList; 
import java.util.List;

public class Graph {
    class Pair{
        int node;
        int weight;

        Pair(int n, int w){
            node = n;
            weight = w;
        }

        // (Node, Weight)
        @Override
        public String toString(){
            return "("+node+","+weight+")";
        }
    }
    int[][] adjMatrix;
    List<List<Integer>> adjList;

    List<List<Pair>> adjMatrixWeight;

    public Graph(int Nodes){
        adjMatrix = new int[Nodes][Nodes];
        adjList = new ArrayList<List<Integer>>();

        adjMatrixWeight = new ArrayList<>();
        for(int i=0;i<Nodes;i++){
            adjList.add(new ArrayList<Integer>());
            adjMatrixWeight.add(new ArrayList<>());
        }
    }

    public void addEdgesInMatrix(int edges[][], boolean isDirected){
        for(int edge[] : edges){
            int u = edge[0];
            int v = edge[1];

            // directed
            if(isDirected){
                adjMatrix[u][v] = 1;
            }
            else{
                adjMatrix[u][v] = 1;
                adjMatrix[v][u] = 1;
            }
        }
    }
    public void addEdgesInList(int edges[][], boolean isDirected){
        for(int edge[] : edges){
            int u = edge[0];
            int v = edge[1];

            if(isDirected){
                adjList.get(u).add(v);
            }
            else{
                adjList.get(u).add(v);
                adjList.get(v).add(u);
            }
        }
    }
    public void addEdgeWithWeight(int[][] edges, boolean isDirected){
        for(int edge[] : edges){
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];

            // directed
            if(isDirected){
                adjMatrix[u][v] = w;
            }
            else{
                adjMatrix[u][v] = w;
                adjMatrix[v][u] = w;
            }
        }
    }
    public void addEdgesInListwithWeight(int edges[][], boolean isDirected){
        for(int edge[] : edges){
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];

            if(isDirected){
                Pair pair = new Pair(v, w);
                adjMatrixWeight.get(u).add(pair);
            }
            else{
                Pair pair1 = new Pair(v, w);
                Pair pair2 = new Pair(u, w);
                adjMatrixWeight.get(u).add(pair1);
                adjMatrixWeight.get(v).add(pair2);
            }
        }
    }
    public void printMatrix(){
        for(int i=0;i<adjMatrix.length;i++){
            System.out.print(i+"-> ");
            for(int j=0;j<adjMatrix[i].length;j++){
                System.out.print(adjMatrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public void printMatrixList(){
        for(int i=0;i<adjList.size();i++){
            System.out.print(i + " -> ");
            System.out.print("[");
            for(int j=0;j<adjList.get(i).size();j++){
                if(j == adjList.get(i).size() - 1){
                    System.out.print(adjList.get(i).get(j));
                }else{
                    System.out.print(adjList.get(i).get(j)+", ");
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }
    public void printMatrixListWeight(){
        for(int i=0;i<adjMatrixWeight.size();i++){
            System.out.print(i + " -> ");
            System.out.print("[");
            for(int j=0;j<adjMatrixWeight.get(i).size();j++){
                if(j == adjMatrixWeight.get(i).size() - 1){
                    System.out.print(adjMatrixWeight.get(i).get(j));
                }else{
                    System.out.print(adjMatrixWeight.get(i).get(j)+", ");
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // edges with weights: {u, v, weight}
        int edges[][] = {
            {0,2,5},
            {0,1,3},
            {1,3,2}
        };
        // int nodes = 4;
        // Graph graph = new Graph(nodes);
        // System.out.println("Undirected Graph");
        // graph.addEdgeWithWeight(edges, false);
        // graph.printMatrix();

        // System.out.println("directed Graph");
        // Graph directedGraph = new Graph(nodes);
        // directedGraph.addEdgeWithWeight(edges, true);
        // directedGraph.printMatrix();

        int nodes = 4;
        Graph graph = new Graph(nodes);
        System.out.println("Undirected Graph");
        graph.addEdgesInListwithWeight(edges, false);
        graph.printMatrixListWeight();

        System.out.println("directed Graph");
        Graph directedGraph = new Graph(nodes);
        directedGraph.addEdgesInListwithWeight(edges, true);
        directedGraph.printMatrixListWeight();
    }
}
