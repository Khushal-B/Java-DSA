import java.util.*;

/**
 * BubbleSort
 */
public class BubbleSort {

    public static int[] sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j+1]<arr[j]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
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