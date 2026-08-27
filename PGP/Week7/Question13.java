class Solution {
    public boolean isNegativeWeightCycle(int V, int[][] edges) {

        // 0 means every vertex is reachable initially.
        // This allows us to detect negative cycles
        // even in disconnected components.
        int[] dist = new int[V];

        // Relax edges V times
        for (int i = 0; i < V; i++) {

            boolean updated = false;

            for (int[] edge : edges) {
                int u = edge[0];
                int v = edge[1];
                int w = edge[2];

                if (dist[v] > dist[u] + w) {
                    dist[v] = dist[u] + w;
                    updated = true;

                    // If relaxation is possible on the
                    // V-th iteration, negative cycle exists.
                    if (i == V - 1) {
                        return true;
                    }
                }
            }

            // No changes means no negative cycle
            if (!updated) {
                break;
            }
        }

        return false;
    }
}