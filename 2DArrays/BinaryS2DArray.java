class BinaryS2DArray {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int i=0, j=matrix[0].length-1;
        while(j>=0 && i<=matrix.length-1){
            if(matrix[i][j]==target)
                return true;
            else if(matrix[i][j]<target)
                i++;
            else
                j--;
        }
        return false;
        
    }
    public static void main(String[] args) {
        int[][] arr={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        System.out.println("The ans is "+searchMatrix(arr,15));
    }
}