import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int[] array = new int[N];

            for (int i = 0; i < N; i++) {
                array[i] = scanner.nextInt();
            }

            int result = minimizeMaxDifference(array);
            System.out.println(result);
        }
        scanner.close();
    }

    private static int minimizeMaxDifference(int[] array) {
        TreeSet<Integer> values = new TreeSet<>();
        for (int num : array) {
            while (num % 2 == 0) {
                num /= 2;
            }
            values.add(num);
        }

        int minValue = values.first();
        int maxValue = values.last();
        int minDiff = maxValue - minValue;

        for (int num : values) {
            while (num <= maxValue) {
                num *= 2;
                if (num <= maxValue) {
                    minValue = values.first();
                    minDiff = Math.min(minDiff, maxValue - minValue);
                }
            }
        }

        return minDiff;
    }
}
