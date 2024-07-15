
class BinarySearch2D {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int[] start={0,0};
        int[] end={matrix.length-1,matrix[0].length-1};
        int[] mid=new int[2];

        while(start[0]<=end[0] && start[1]<=end[1]){

            mid[0]=(start[0]+end[0])/2;
            mid[1]=(start[1]+end[1])/2;
            
            if(matrix[mid[0]][mid[1]]==target)
                return true;
            
            else if(matrix[mid[0]][mid[1]]>target){
                if(mid[1]!=0)
                    end[1]=mid[1]-1;
                else{
                    end[1]=matrix[0].length-1;
                    end[0]=mid[0]-1;
                }
            }else if(matrix[mid[0]][mid[1]]<target){
                if(mid[1]!=matrix[0].length-1)
                    start[1]=mid[1]+1;
                else{
                    start[1]=0;
                    start[0]=mid[0]+1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println("The ans is "+searchMatrix(arr,3));
    }
}
