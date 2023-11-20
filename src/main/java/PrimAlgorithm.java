package src.main.java;
import java.util.Arrays;

public class PrimAlgorithm {
    private static final int INF = Integer.MAX_VALUE;

    public static int prim(int[][] graph) {
        int numVertices = graph.length;
        boolean[] visited = new boolean[numVertices];
        int[] dist = new int[numVertices];
        int[] parent = new int[numVertices];

        Arrays.fill(dist, INF);
        dist[0] = 0;
        parent[0] = -1;

        int totalWeight = 0;

        for (int i = 0; i < numVertices - 1; i++) {
            int minIndex = -1;
            for (int j = 0; j < numVertices; j++) {
                if (!visited[j] && (minIndex == -1 || dist[j] < dist[minIndex])) {
                    minIndex = j;
                }
            }

            visited[minIndex] = true;
            totalWeight += dist[minIndex];

            for (int j = 0; j < numVertices; j++) {
                int edgeWeight = graph[minIndex][j];
                if (edgeWeight > 0 && !visited[j] && edgeWeight < dist[j]) {
                    parent[j] = minIndex;
                    dist[j] = edgeWeight;
                }
            }
        }

        return totalWeight;
    }
}
