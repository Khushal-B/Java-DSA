public class NKnights {
    public static void main(String[] args) {
        int n=4;
        char[][] board=new char [n][n];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                board[i][j]='X';
            }
        }
        maxNightsPrint(0,board,0,0);
    }
    public static void maxNightsPrint(int n,char[][] board,int rn,int cn){
        if(rn>=board.length){
            System.out.println("\nNo of Knights are: "+n);
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board[0].length;j++){
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
            return;
        }
        int nrn=rn,ncn=cn;
        if(ncn==(board[0].length-1)){
            ncn=0;
            nrn++;
        }else{
            ncn++;
        }

        if(rn>1){

            if(cn>1 && cn<board[0].length-2){
                if(board[rn-1][cn-2]=='X'&& board[rn-1][cn+2]=='X' && board[rn-2][cn-1]=='X'&& board[rn-2][cn+1]=='X'){
                    board[rn][cn]='N';
                    maxNightsPrint(n+1, board, nrn, ncn);
                    board[rn][cn]='X';
                }
            }else if(cn==0){
                if(cn+2<board[0].length){
                        if(board[rn-1][cn+2]=='X'&& board[rn-2][cn+1]=='X'){
                            board[rn][cn]='N';
                            maxNightsPrint(n+1, board, nrn, ncn);
                            board[rn][cn]='X';
                        }
                }else if(cn+1<board[0].length){
                    if(board[rn-1][cn+2]=='X'){
                        board[rn][cn]='N';
                        maxNightsPrint(n+1, board, nrn, ncn);
                        board[rn][cn]='X';
                    }
                }
            }else if(cn==1){
                if(cn+2<board[0].length){
                    if(board[rn-1][cn+2]=='X'&& board[rn-2][cn+1]=='X' && board[rn-2][cn-1]=='X'){
                        board[rn][cn]='N';
                        maxNightsPrint(n+1, board, nrn, ncn);
                        board[rn][cn]='X';
                    }
                }else if(cn+1<board[0].length){
                    if(board[rn-2][cn+1]=='X' && board[rn-2][cn-1]=='X'){
                        board[rn][cn]='N';
                        maxNightsPrint(n+1, board, nrn, ncn);
                        board[rn][cn]='X';
                    }
                }
            }else if(cn==board[0].length-1){
                    if(board[rn-1][cn-2]=='X'&& board[rn-2][cn-1]=='X'){
                        board[rn][cn]='N';
                        maxNightsPrint(n+1, board, nrn, ncn);
                        board[rn][cn]='X';
                    }
            }
            else if(cn==board[0].length-2){
                if(board[rn-1][cn-2]=='X'&& board[rn-2][cn-1]=='X' && board[rn-2][cn+1]=='X'){
                    board[rn][cn]='N';
                    maxNightsPrint(n+1, board, nrn, ncn);
                    board[rn][cn]='X';
                }
            }
            

        }else if(rn==1){
            if(cn>1 && cn<board[0].length-2){
                if(board[rn-1][cn-2]=='X'&& board[rn-1][cn+2]=='X'){
                    board[rn][cn]='N';
                    maxNightsPrint(n+1, board, nrn, ncn);
                    board[rn][cn]='X';
                }
            }else if(cn>1){
                if(board[rn-1][cn-2]=='X'){
                    board[rn][cn]='N';
                    maxNightsPrint(n+1, board, nrn, ncn);
                    board[rn][cn]='X';
                }
            }else if(cn<board[0].length-2){
                if( board[rn-1][cn+2]=='X'){
                    board[rn][cn]='N';
                    maxNightsPrint(n+1, board, nrn, ncn);
                    board[rn][cn]='X';
                }
            }else{
                board[rn][cn]='N';
                maxNightsPrint(n+1, board, nrn, ncn);
                board[rn][cn]='X';
            }

        }else if(rn==0){
            board[rn][cn]='N';
            maxNightsPrint(n+1, board, nrn, ncn);
            board[rn][cn]='X';

        }

        maxNightsPrint(n, board, nrn, ncn);
    }
}
