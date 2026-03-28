package graph.DSU;

public class DisjointSet {
    int[] rank;
    int[] parent;
    int[] size;

    int components;

    DisjointSet(int nodes){
        this.rank = new int[nodes];
        this.parent = new int[nodes];
        this.size = new int[nodes];
        this.components = nodes;

        for(int i=0;i<nodes;i++){
            this.parent[i] = i;
            this.rank[i] = 0;
            this.size[i] = 1;
        }
    }

    public int findRootComponents(int node){

        if(node == parent[node]){
            return node;
        }

        parent[node] = findRootComponents(parent[node]);

        return parent[node];
    }

    public void unionByRank(int node1, int node2){
        int rootParent1 = findRootComponents(node1);
        int rootParent2 = findRootComponents(node2);

        if(rootParent1 == rootParent2) return;

        components--;

        if(rank[rootParent1] < rank[rootParent2]){
            parent[rootParent1] = rootParent2;
        }
        else if(rank[rootParent2] < rank[rootParent1]){
            parent[rootParent2] = rootParent1;
        }
        else{
            parent[rootParent2] = rootParent1;
            rank[rootParent1]++;
        }
    }
    
    public void unionBySize(int node1, int node2){
        int rootParent1 = findRootComponents(node1);
        int rootParent2 = findRootComponents(node2);

        if(rootParent1 == rootParent2) return;

        components--;

        if(size[rootParent1] < size[rootParent2]){
            parent[rootParent1] = rootParent2;
            size[rootParent2] += size[rootParent1];
        }
        else if(size[rootParent2] < size[rootParent1]){
            parent[rootParent2] = rootParent1;
            size[rootParent1] += size[rootParent2];
        }
        else{
            parent[rootParent2] = rootParent1;
            size[rootParent1] += size[rootParent2];
        }
    }
    public static void main(String[] args) {
        // DisjointSet dsu = new DisjointSet(4);
        // System.out.println("Total components -> " + dsu.components);

        // System.out.println(dsu.findRootComponents(0) == dsu.findRootComponents(3));
        // dsu.unionByRank(0, 3);
        // System.out.println("Total components -> " + dsu.components);

        // System.out.println(dsu.findRootComponents(0) == dsu.findRootComponents(3));

        DisjointSet dsu = new DisjointSet(4);
        System.out.println("Total components -> " + dsu.components);

        System.out.println(dsu.findRootComponents(0) == dsu.findRootComponents(3));
        dsu.unionBySize(0, 3);
        System.out.println("Total components -> " + dsu.components);

        System.out.println(dsu.findRootComponents(0) == dsu.findRootComponents(3));

    }
}


