import java.util.TreeMap;
import java.util.Map;
import java.util.Stack;

public class GFG {

public static void main(String[] args) {
    Solution s = new Solution();
    int arr[]={1,1,2,3,3,4,5};
    System.out.println(s.minAbsDiff(arr));
}
}
class Solution {
public int minAbsDiff(int[] nums)
{
TreeMap<Integer,Integer> map = new TreeMap<>();

    for(int i=0; i<nums.length; i++)
    {
        if(nums[i]!=0)
            while(nums[i]%2!=1)
            {
                nums[i] = nums[i]/2;
            }
        map.put(nums[i],0);
    }
    for(int i : nums) {
        int temp = map.get(i);
        map.replace(i, temp + 1);
    }
    int minDiff = Integer.MAX_VALUE;
    int prev = -1;
    for(int i: map.keySet()) {
        if(map.get(i)>1)
            return 0;
        if(prev==-1)
            prev=i;
        else
        {
            if(i-prev<minDiff)
            {
                minDiff = i-prev;
            }
            if(i-prev*2<minDiff && i>=prev*2)
            {
                minDiff = i-prev*2;
            }
            prev=i;
        }
    }
    return minDiff;
}
}