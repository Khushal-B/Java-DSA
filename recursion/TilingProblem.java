public class TilingProblem {
    public static void main(String[] args) {
        System.out.println("No ow ways is "+ways2(5000));
    }
    public static int ways(int n){ //O(n) --> TC is Almost like Optimised Power 2
                                   //Even using fibonacci method gives O(n) TC
        if(n==1) return 1;
        if(n==2) return 2;
        if(n==3) return 3;

        return (ways(n/2)*ways(n-(n/2)))+(ways((n/2)-1)*ways((n-(n/2))-1));

        //ie. ways(7)= ways(3)*ways(4) + ways(2)*ways(3)
        /*this is because if i divide a number from between and try to find the number
        of ways of each half and multiply them then it gives less than actual total combinations 
        as some combinations are missing. These missing combinations are what happen after the + sign.
        These missing combination are a result of fact that the tiles adjecent to both the boundries 
        are always considered to have verticle tiling but it can also happen that they have horizontal
        tiling if they are attached. In case of horizontal tiling, each side will have one less time and 
        then again act recursively */
    }
    public static int ways2(int n){ //O(2^n)
        if (n == 1 || n==0)
            return n;
        return ways2(n - 1) + ways2(n - 2);
    }
}
