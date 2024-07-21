public class CompleteKnightTour {
    public static void main(String[] args) {
        int n=6;
        int[][] grid=new int[n][n];
    
        System.out.println(findPath(grid,1,0,0));
        printPath(grid);

    }
    public static void printPath(int[][] grid){
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean findPath(int[][] grid,int step,int row,int col){
        if(step==grid.length*grid[0].length+1 ) {
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[0].length;j++){
                    if(grid[i][j]==0)
                        return false;
                }
            }
            return true;
        }
        if(row>=grid.length || row<0 || col>=grid[0].length || col<0 || grid[row][col]!=0)
            return false;


        int[] i={1,2,1,2,-1,-2,-1,-2};
        int[] j={2,1,-2,-1,2,1,-2,-1};

        for(int k=0;k<8;k++){
            grid[row][col]=step;
            if(findPath(grid,step+1,row+i[k],col+j[k])){
                return true;
            }
                grid[row][col]=0;
        }
        return false;
    }
}
