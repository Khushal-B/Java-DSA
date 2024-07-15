import java.util.*;

/**
 * SpiralMatrix
 */
public class SpiralMatrix {

    public static int[] spiral(int[][] arr){
        int n=arr.length, m=arr[0].length;
        int rmax=n-1,rmin=0,cmax=m-1,cmin=0;
        int p=0,q=0;
        int[] spiralArr=new int[n*m];

        for(int i=0;i<n*m;i++){

            if(p==rmin && q<cmax ){
                spiralArr[i]=arr[p][q];
                q++;
                if(q==cmax){
                    spiralArr[i+1]=arr[p][q];
                    i++;
                    p++;
                    rmin++;
                }              
            }
            else if(q==cmax && p<rmax ){
                spiralArr[i]=arr[p][q];
                p++;
                if(p==rmax){
                    spiralArr[i+1]=arr[p][q];
                    i++;
                    q--;
                    cmax--;
                }
            }
            else if(p==rmax && q>cmin){
                spiralArr[i]=arr[p][q];
                q--;
                if(q==cmin){
                    spiralArr[i+1]=arr[p][q];
                    i++;
                    p--;
                    rmax--;
                }
            }
            else if(q==cmin && p>rmin){
                spiralArr[i]=arr[p][q];
                p--;
                if(p==rmin){
                    spiralArr[i+1]=arr[p][q];
                    i++;
                    q++;
                    cmin++;
                }
            }            

        }

        return spiralArr;

    }

    public static void main(String[] args) {

        int[][] arr={{1,2,10},{3,4,11},{5,6,12},{7,8,13}};
        
        int[] spiralArr=spiral(arr);
        for(int i=0;i<spiralArr.length;i++){
            System.out.print(spiralArr[i]+" ");
        }

    }
}