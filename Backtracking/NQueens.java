public class NQueens {
    public static int c=0;
    public static void main(String[] args) {

        int n=8,cnt=0,rn=0,cn=0;
        int pos[][]=new int[n][2];
        char[][] board=new char[n][n];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                board[i][j]='X';
            }
        }
        for(int i=0;i<pos.length;i++){
            for(int j=0;j<pos[0].length;j++){
                pos[i][j]=-1;
            }
        }
        printNQueenSolution(n,cnt,board,pos,rn,cn);
    }
    public static void printNQueenSolution(int n,int cnt,char[][] board,int[][] pos,int rn,int cn){
        
        if(cnt==n){
            c++;
            System.out.println("\nSolution no "+c);
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board[0].length;j++){
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            } 
            return;
        }
        if(rn==(n-1)&&cn==(n-1))
            return;
        
        int nrn=rn,ncn=cn;
        if(ncn==(n-1)){
            ncn=0;
            nrn++;
        }else{
            ncn++;
        }

        printNQueenSolution(n, cnt, board, pos, nrn, ncn);
       
        boolean check=true;
        for(int i=0;i<cnt;i++){
            if(pos[i][0]==rn ||pos[i][1]==cn|| Math.abs(pos[i][0]-rn)==Math.abs(pos[i][1]-cn)){
                check=false;
                break;
            }
        }
        if(check){
            char[][] tempboard=new char[n][n];
            int[][] temppos=new int[n][2];

            for(int i=0;i<tempboard.length;i++){
                for(int j=0;j<tempboard[0].length;j++){
                    tempboard[i][j]=board[i][j];
                }
            }
            tempboard[rn][cn]='Q';
            for(int i=0;i<temppos.length;i++){
                for(int j=0;j<temppos[0].length;j++){
                    temppos[i][j]=pos[i][j];
                }
            }

            temppos[cnt][0]=rn;
            temppos[cnt][1]=cn;
            cnt++;
            printNQueenSolution(n, cnt, tempboard, temppos, nrn, ncn);
        }

    }
}

