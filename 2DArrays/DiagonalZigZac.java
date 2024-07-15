class DiagonalZigZac {
    public static int[] findDiagonalOrder(int[][] mat) {
        int p=0,q=0,i=0,dir=1;
        int[] arr=new int[mat.length*mat[0].length];
        do{
            arr[i]=mat[p][q];
            i++;
            if(dir==1 && (p==0 || q==mat[0].length-1)){

                if(q==mat[0].length-1)
                    p++;
                else
                    q++;
                dir=0;

            }else if(dir==0 && (q==0 || p==mat.length-1)){

                if(p==mat.length-1)
                    q++;
                else
                    p++;

                    // arr[i]=mat[p][q];
                    // i++;
                    // p--;
                    // q++;
                    dir=1;

            }else {
                if(dir==0){
                p++;
                q--;
                }else if(dir==1){
                    p--;
                    q++;
                }
            }

        }while(q!=mat[0].length && p!=mat.length);
        
        return arr;
        
    }
    public static void main(String[] args) {
        int[][] num={{1}};
        int[] ans=findDiagonalOrder(num);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}