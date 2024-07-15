import java.util.*;

public class SelectionSort {

    public static int[] sort(int[] arr){

        for(int i=0;i<arr.length;i++){
            int pos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[pos]){
                    pos=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[pos];
            arr[pos]=temp;
            
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr={2,5,3,8,0,5,1,7,6,5,9,3,11,12,6,4,23,9,9,0,-1,45};
        int[] sArr=sort(arr);
        for(int i=0;i<sArr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}