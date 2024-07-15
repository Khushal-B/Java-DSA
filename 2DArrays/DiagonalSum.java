class DiagonalSum {
    public static int diagonalSum(int[][] mat) {
        int add=mat.length, sum=0;
        int p=0,q=0;
        for(int i=0;i<mat.length;i++){
            sum+=mat[p][q];
            p++;
            q++;
        }
        p=0;
        q=mat.length-1;
        for(int i=0;i<mat.length;i++){
            if(p==q){
                p++;
                q--;
                continue;
            }
            sum+=mat[p][q];
            p++;
            q--;
            
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("The sum is "+diagonalSum(arr));
    }
}