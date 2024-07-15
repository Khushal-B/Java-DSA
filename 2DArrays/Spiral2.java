public class Spiral2 {
    //MY DIRECTION BASED APPROACH
    public static int[] spiral(int[][] arr){
        int n=arr.length, m=arr[0].length;
        int rmax=n-1,rmin=0,cmax=m-1,cmin=0;
        int p=0,q=-1, dir=0;
        int[] spiralArr=new int[n*m];

        for(int i=0;i<n*m;i++){
            if(dir==0){
                q++;
                spiralArr[i]=arr[p][q];
                if(q==cmax){
                    dir=1;
                    rmin++;
                }
            } else if(dir==1){
                p++;
                spiralArr[i]=arr[p][q];
                if(p==rmax){
                    dir=2;
                    cmax--;
                }
            } else if(dir==2){
                q--;
                spiralArr[i]=arr[p][q];
                if(q==cmin){
                    dir=3;
                    rmax--;
                }
            }else if(dir==3){
                p--;
                spiralArr[i]=arr[p][q];
                if(p==rmin){
                    dir=0;
                    cmin++;
                }
            }
        }
        return spiralArr;
    }

    public static void main(String[] args) {

        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        
        int[] spiralArr=spiral(arr);
        for(int i=0;i<spiralArr.length;i++){
            System.out.print(spiralArr[i]+" ");
        }

    }
}