import java.util.*;

public class InsertionSort {

    public static int[] sort(int[] arr){

        for(int i=1;i<arr.length;i++){
            int pos=i-1, temp=arr[i];
            while(pos>=0 && temp<arr[pos]){
                arr[pos+1]=arr[pos];
                pos--;
            }
            arr[pos+1]=temp;
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