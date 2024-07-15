import java.util.Scanner;

public class ArrayDifferenceMinimizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int[] arr = new int[N];
            
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }
            
            System.out.println(minimizeMaxDifference(arr));
        }
        
        scanner.close();
    }
    
    public static int minimizeMaxDifference(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (int num : arr) {
            int minimized = minimizeNumber(num);
            min = Math.min(min, minimized);
            max = Math.max(max, minimized);
        }
        
        return max - min;
    }
    
    public static int minimizeNumber(int num) {
        while (num > 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                return num;
            }
        }
        return num;
    }
}