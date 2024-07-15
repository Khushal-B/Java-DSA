
public class SubArraySum {
    public static int[] SubArrayMinMax(int[] args) {
        int[] minMax={Integer.MAX_VALUE,Integer.MIN_VALUE};
        int sum=0;
        for(int i=0; i<args.length;i++){
            sum=0;
            for(int j=i;j<args.length;j++){

                sum+=args[j];
                minMax[0]=Math.min(sum, minMax[0]);
                minMax[1]=Math.max(sum, minMax[1]);
            }
        }
        return minMax;
    }

    public static void main(String[] args) {
        int[] arr={-1,-2,6,-11,3};
        int[] ans=SubArrayMinMax(arr);
        System.out.println("The min is "+ans[0]+" and the max is "+ans[1]);
    }
}


//BRUTE FORCE:

// public class SubArraySum {
//     public static int[] SubArrayMinMax(int[] args) {
//         int[] minMax={Integer.MAX_VALUE,Integer.MIN_VALUE};
//         int sum=0;
//         for(int i=0; i<args.length;i++){
//             for(int j=i;j<args.length;j++){

//                 for(int k=i;k<=j;k++){

//                     sum+=args[k];
                    
//                 }
//                 minMax[0]=Math.min(sum, minMax[0]);
//                 minMax[1]=Math.max(sum, minMax[1]);
//                 sum=0;
//             }
//         }
//         return minMax;
//     }

//     public static void main(String[] args) {
//         int[] arr={1,-2,6,-1,3};
//         int[] ans=SubArrayMinMax(arr);
//         System.out.println("The min is "+ans[0]+" and the max is "+ans[1]);
//     }
// }
