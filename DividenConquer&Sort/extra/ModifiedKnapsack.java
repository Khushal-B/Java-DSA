import java.util.*;

public class ModifiedKnapsack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[][] elements = new int[N][3];
        
        for (int i = 0; i < N; i++) {
            elements[i][0] = scanner.nextInt(); // type
            elements[i][1] = scanner.nextInt(); // weight
            elements[i][2] = scanner.nextInt(); // value
        }
        
        int K = scanner.nextInt();

        System.out.println(maximizeKnapsackValue(N, elements, K));
    }

    private static int maximizeKnapsackValue(int N, int[][] elements, int K) {
        Map<Integer, List<int[]>> typeToElements = new HashMap<>();
        for (int[] element : elements) {
            int type = element[0];
            typeToElements.putIfAbsent(type, new ArrayList<>());
            typeToElements.get(type).add(element);
        }

        int[] dp = new int[K + 1];
        Arrays.fill(dp, 0);

        for (List<int[]> sameTypeElements : typeToElements.values()) {
            int[] currentDp = Arrays.copyOf(dp, dp.length);
            for (int[] element : sameTypeElements) {
                int weight = element[1];
                int value = element[2];
                for (int j = K; j >= weight; j--) {
                    currentDp[j] = Math.max(currentDp[j], dp[j - weight] + value);
                }
            }
            dp = currentDp;
        }

        return dp[K];
    }
}
