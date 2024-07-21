/*Jordan is watching a soccer team train for their upcoming game. They want to improve their passing skills in the training.

The game involves x players, making multiple passes towards each other. The balls were moving too fast for Jordan to estimate how many balls were involved in the game. He only knows the number of passes delivered by each player during the session.

Output the minimum possible no. of balls that were involved in the game.

Input Format

The first line contains a single integer n which is the number of test cases. This is followed by the test case's description.

The first line of each test case contains one integer x which is the number of players.

The second line of the test case contains a sequence of integers a1,a2,…,an , where ai is the number of passes delivered by the i-th player.

It is guaranteed that the sum of x over all test cases doesn't exceed 10^5.

Constraints

(1≤n≤5⋅10^4)

(2≤x≤10^5)

(0≤ai≤10^9)

Output Format

Print a single integer.

Sample Input 0

4
4
2 3 3 2
3
1 5 2
2
0 0
4
1000000000 1000000000 1000000000 1000000000
Sample Output 0

1
2
0
1
Explanation 0

First test case, with only one ball, the game can go like this:

2 -> 1 -> 3 -> 4 -> 1 -> 2 -> 3 -> 4 -> 2 -> 3 -> 2.

Second test case, there are no possible ways to play the game with only one ball. One way to play with two balls:

2 -> 1 -> 2 -> 3 -> 2 -> 1.

2 -> 3 -> 2 -> 1 In the third example, there were no passes, so 0 balls are possible.

Sample Input 1

1
10
1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000
Sample Output 1

1 */

import java.util.Arrays;
import java.util.Scanner;

public class SoccerPractice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of players: ");

        int[] arr={10,100,0};

        System.out.println("The balls required are: "+countBalls(arr));
    }

    public static int countBalls(int[] arr){
        if(arr.length==0)
            return 0;
        if(arr.length==1)
            return arr[0];

        Arrays.sort(arr);
        if(arr[arr.length-1]==0)
            return 0;

        if(arr.length==2)
            return arr[1]-arr[0];

        int sum=0;
        int diff=arr[arr.length-1]-arr[arr.length-2];
        for(int i=0;i<arr.length-2;i++){
            sum+=arr[i];
            if(sum>=diff)
                return 1;
        }
        return diff-sum;
    } 
    
}
        // int[] arr2=new int[arr.length+1];
        // arr2[0]=0;
        // for(int i=1;i<arr2.length;i++){
        //     arr2[i]=arr[i-1];
        // }
        // for(int i=arr2.length-2;i>0;i--){
            
        //     int diff=arr2[i]-arr2[i-1];
        //     for(int j=i;j<arr2.length;j++){
        //        
        //         arr2[j]=arr2[j]-diff;
        //         
        //     }
        // }

        // if(arr2[arr2.length-1]==0)
        //     return 1;
        // return arr2[arr2.length-1];

 