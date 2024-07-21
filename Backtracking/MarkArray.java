/*Mark has an array of x integers. In one second, he can swap two neighboring array elements. Now he wants to obtain an array where any two neighboring array elements would be different in finite times.

Input Format

x is the number of elements in the array which is denoted in the first line. The second line contains x integers a1, a2, ..., ax which is the array elements.

Constraints

(1 ≤ ai ≤ 1000) (1 ≤ x ≤ 100)

Output Format

If Mark can obtain the array that is requried print "YES" (without the quotes) & or else print "NO".

Sample Input 0

1
1
Sample Output 0

YES
Sample Input 1

3
1 1 2
Sample Output 1

YES
Explanation 1

Mark can get array: 1, 2, 1. He can swap the last and the second last elements to obtain it. */

import java.util.Arrays;
import java.util.Scanner;

public class MarkArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        int n=sc.nextInt();
       
        int[] arr=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(check(arr));
    }
    public static boolean check(int[] arr){
        if(arr.length<=1)
            return true;
        Arrays.sort(arr);
        int maxCnt=1,curMax=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                curMax++;
            }else{
                maxCnt=Math.max(curMax, maxCnt);
                curMax=1;
            }
        }
        maxCnt=Math.max(curMax, maxCnt);
        if(maxCnt<=(arr.length+1)/2)
            return true;
        else
            return false;
    }
}
