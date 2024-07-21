public class SudokuSolver {
    public static void main(String[] args) {
        int[][] sudokuArray = {
            {5, 3, -1, -1, 7, -1, -1, -1, -1},
            {6, -1, -1, 1, 9, 5, -1, -1, -1},
            {-1, 9, 8, -1, -1, -1, -1, 6, -1},
            {8, -1, -1, -1, 6, -1, -1, -1, 3},
            {4, -1, -1, 8, -1, 3, -1, -1, 1},
            {7, -1, -1, -1, 2, -1, -1, -1, 6},
            {-1, 6, -1, -1, -1, -1, 2, 8, -1},
            {-1, -1, -1, 4, 1, 9, -1, -1, 5},
            {-1, -1, -1, -1, 8, -1, -1, 7, 9}
        };
        System.out.println(sudokuSolver(sudokuArray));
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(sudokuArray[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean sudokuSolver(int[][] sudokuArray){
        // if(r>=9){
        //     return true;
        // }
        // int nrn=r,ncn=col;
        // if(ncn==(sudokuArray[0].length-1)){
        //     ncn=0;
        //     nrn++;
        // }else{
        //     ncn++;
        // }
        // for(int r=0;)

        // if(sudokuArray[r][col]==-1){
        //     for(int i=1;i<=9;i++){
        //         if(check(sudokuArray,i,r,col)){
        //             sudokuArray[r][col]=i;
        //             if(sudokuSolver(sudokuArray, nrn, ncn)){
        //                 return true;
        //             }
        //             sudokuArray[r][col]=-1;
        //         }
        //     }
        //     return false;
        // }else{
        //     if(sudokuSolver(sudokuArray, nrn, col)){
        //         return true;
        //     }
        //     return false;
        // }

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(sudokuArray[i][j]==-1){
                    for(int k=1;k<=9;k++){
                        if(check(sudokuArray, k, i, j)){
                            sudokuArray[i][j]=k;
                            if(sudokuSolver(sudokuArray))
                                return true;
                            else
                                sudokuArray[i][j]=-1;
                        }
                    }
                    return false;
                }
                
            }
        }
        return true;
        
    }


    public static boolean check(int[][] sudokuArray, int n,int row, int col){
        for(int i=0;i<9;i++){
            if(sudokuArray[row][i]==n)
                return false;
        }
        for(int i=0;i<9;i++){
            if(sudokuArray[i][col]==n)
                return false;
        }
        if(col<3){
            if(row<3){
                for(int i=0;i<=2;i++){
                    for(int j=0;j<=2;j++){
                        if(sudokuArray[i][j]==n)
                            return false;
                    }
                }
            }else if(row>5){
                for(int i=6;i<=8;i++){
                    for(int j=0;j<=2;j++){
                        if(sudokuArray[i][j]==n)
                            return false;
                    }
                }
            }else{
                for(int i=3;i<=5;i++){
                    for(int j=0;j<=2;j++){
                        if(sudokuArray[i][j]==n)
                            return false;
                    }
                }
            }

        }else if(col>5){
            if(row<3){
                for(int i=0;i<=2;i++){
                    for(int j=6;j<=8;j++){
                        if(sudokuArray[i][j]==n)
                            return false;
                    }
                }
            }else if(row>5){
                for(int i=6;i<=8;i++){
                    for(int j=6;j<=8;j++){
                        if(sudokuArray[i][j]==n)
                            return false;
                    }
                }
            }else{
                for(int i=3;i<=5;i++){
                    for(int j=6;j<=8;j++){
                        if(sudokuArray[i][j]==n)
                            return false;
                    }
                }
            }

        }else{
            if(row<3){
                for(int i=0;i<=2;i++){
                    for(int j=3;j<=5;j++){
                        if(sudokuArray[i][j]==n)
                            return false;
                    }
                }
            }else if(row>5){
                for(int i=6;i<=8;i++){
                    for(int j=3;j<=5;j++){
                        if(sudokuArray[i][j]==n)
                            return false;
                    }
                }
            }else{
                for(int i=3;i<=5;i++){
                    for(int j=3;j<=5;j++){
                        if(sudokuArray[i][j]==n)
                            return false;
                    }
                }
            }

        }
        return true;
    }

}
