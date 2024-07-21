import java.util.HashMap;
import java.util.Map;

public class GoodSubarrays {
    
    public static int countGoodSubarrays(int[] arr, int x) {
        int n = arr.length;
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            Map<Integer, Integer> freqMap = new HashMap<>();
            for (int j = i; j < n; j++) {
                freqMap.put(arr[j], freqMap.getOrDefault(arr[j], 0) + 1);
                if (isValidSubarray(freqMap, x)) {
                    count++;
                }
            }
        }
        
        return count;
    }
    
    private static boolean isValidSubarray(Map<Integer, Integer> freqMap, int x) {
        int count = 0;
        for (int freq : freqMap.values()) {
            if (freq >= 3) {
                count++;
            }
        }
        return count == x;
    }


    public static void main(String[] args) {
        int[] arr = {2,2,3,3,2,5,3,3,5};
        int x = 2;
        int result = countGoodSubarrays(arr, x);
        System.out.println(result);  // Output: 1
    }
}

