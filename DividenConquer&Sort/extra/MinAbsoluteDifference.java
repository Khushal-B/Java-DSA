import java.util.*;

public class MinAbsoluteDifference {
    public static int minAbsoluteDiff(List<Integer> a, int k) {
        TreeSet<Integer> pos = new TreeSet<>();
        
        for (int num : a) {
            Set<Integer> curPos = new HashSet<>();
            curPos.add(num);
            
            if (num % k == 0) {
                int cur = num;
                while (cur % k == 0) {
                    curPos.add(cur / k);
                    cur /= k;
                }
            } else {
                curPos.add(num * k);
            }
            
            pos.addAll(curPos);
        }
        
        int prev = -1;
        int curMin = Integer.MAX_VALUE;
        
        for (int x : pos) {
            if (prev == -1) {
                prev = x;
            } else {
                curMin = Math.min(curMin, x - prev);
                prev = x;
            }
        }
        
        return curMin;
    }
    
    public static void main(String[] args) {
        List<Integer> v = Arrays.asList(22, 22);
        System.out.println(minAbsoluteDiff(v, 2));
    }
}