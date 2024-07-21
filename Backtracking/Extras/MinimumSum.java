import java.util.*;

public class MinimumSum {
    public static long minimumSum(int n, int[] weight, int[][] edges) {
        // Create adjacency list representation of the graph
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        // Initialize the result
        long result = 0;

        // For each pair of nodes
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Find the minimum weight in the path from i to j
                int minWeight = findMinWeightInPath(i, j, n, graph, weight);
                
                // Add the sum of weights of nodes i and j, and the minimum weight in the path
                result += weight[i] + weight[j] + minWeight;
            }
        }

        return result;
    }

    private static int findMinWeightInPath(int start, int end, int n, List<List<Integer>> graph, int[] weight) {
        // Use BFS to find the path with minimum weight
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n];
        int[] parent = new int[n];
        Arrays.fill(parent, -1);

        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            if (current == end) {
                break;
            }

            for (int neighbor : graph.get(current)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    parent[neighbor] = current;
                    queue.offer(neighbor);
                }
            }
        }

        // Find minimum weight in the path
        int minWeight = Integer.MAX_VALUE;
        int node = end;
        while (node != start) {
            if (node != end && weight[node] < minWeight) {
                minWeight = weight[node];
            }
            node = parent[node];
        }

        return minWeight == Integer.MAX_VALUE ? 0 : minWeight;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] weight = new int[] {6, 1, 2, 5, 3};
        int[][] edges = {
            {0, 1},
            {1, 2},
            {0, 4},
            {2, 3}
        };

        long result = minimumSum(n, weight, edges);
        System.out.println("The minimum sum is: " + result);
    }
}