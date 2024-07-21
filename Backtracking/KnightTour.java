class KnightTour {
	// // all the directions using the combo of dirx and diry
    // static int[] dirx = {1,2,-1,-2,1,2,-1,-2};
    // static int[] diry = {2,1,2,1,-2,-1,-2,-1};
    
    // private static boolean solve(int i, int j, int n, int move, int[][] grid){
    //     if(i < 0 || j < 0 || i >= n || j >= n || move != grid[i][j]){
    //         return false;
    //     }
        
    //     if(move == n*n-1)
    //         return true;
        
    //     for(int k = 0; k < 8; k++){
    //         int ni = i+dirx[k];
    //         int nj = j+diry[k];
    //         if(solve(ni, nj, n, move+1, grid))
    //             return true;
    //     }
        
    //     return false;
    // }
    
    // public static boolean checkValidGrid(int[][] grid) {
    //     int n = grid.length;
    //     return solve(0, 0, n, 0, grid);
    // }
    public static boolean checkValidGrid(int[][] grid) {
        if(grid.length<=1)
            return true;
        return checkValidity(grid, 1,0,0);
    }
    public static boolean checkValidity(int[][] grid, int step,int row,int col){
        if(step==(Math.pow(grid.length,2)))
            return true;

        if(inBox(grid.length,row,col,row-1,col-2)){
            if(step==grid[row-1][col-2]){
                if(checkValidity(grid,step+1,row-1,col-2))
                    return true;
            }
        }
        if(inBox(grid.length,row,col,row-2,col-1)){
            if(step==grid[row-2][col-1]){
                if(checkValidity(grid,step+1,row-2,col-1))
                    return true;
        }}
        if(inBox(grid.length,row,col,row+1,col-2)){
            if(step==grid[row+1][col-2]){
               if(checkValidity(grid,step+1,row+1,col-2))
                    return true;
        }}
        if(inBox(grid.length,row,col,row+2,col-1)){
            if(step==grid[row+2][col-1]){
               if(checkValidity(grid,step+1,row+2,col-1))
                    return true;
        }}
        if(inBox(grid.length,row,col,row-1,col+2)){
            if(step==grid[row-1][col+2]){
                if(checkValidity(grid,step+1,row-1,col+2))
                    return true;
        }}
        if(inBox(grid.length,row,col,row-2,col+1)){
            if(step==grid[row-2][col+1]){
                if(checkValidity(grid,step+1,row-2,col+1))
                    return true;
        }}
        if(inBox(grid.length,row,col,row+1,col+2)){
            if(step==grid[row+1][col+2]){
                if(checkValidity(grid,step+1,row+1,col+2))
                    return true;
        }}
        if(inBox(grid.length,row,col,row+2,col+1)){
            if(step==grid[row+2][col+1]){
                if(checkValidity(grid,step+1,row+2,col+1))
                    return true;
        }}
        return false;
    }
    public static boolean inBox(int n, int row, int col, int nextRow, int nextCol){
        if(nextRow<n && nextRow>=0){
            if(nextCol<n && nextCol>=0){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[][] grid={{0,11,16,5,20},{17,4,19,10,15},{12,1,8,21,6},{3,18,23,14,9},{24,13,2,7,22}};
        System.out.println(checkValidGrid(grid));
    }
}