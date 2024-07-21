public class RatMaze {
    public static void main(String[] args) {
        int mat[][] = {{1, 1, 1, 1, 1},
                       {0, 0, 1, 0, 1}, 
                       {0, 1, 1, 0, 1},
                       {0, 1, 0, 0, 1},
                       {1, 1, 1, 1, 1}};
        findAllPaths(mat,0,0,"");
    }
    public static boolean findAllPaths(int[][] mat,int row,int col,String path){
        if(row==mat.length-1 && col==mat[0].length-1){
            System.out.println(path);
            return true;
        }
        if(row<0 || row>=mat.length || col<0 || col>=mat.length){
            return false;
        }
        if(mat[row][col]==1){
            mat[row][col]=0;
            findAllPaths(mat, row+1, col, path+"D");
            findAllPaths(mat, row-1, col, path+"U");
            findAllPaths(mat, row, col+1, path+"R");
            findAllPaths(mat, row, col-1, path+"L");
            mat[row][col]=1;
        }
        return false;
    }
}
