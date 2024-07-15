import java.util.*;

public class CountingSort {

    public static int[] sort(int[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i])
            max=arr[i];
        }

        int[] count=new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int pos=0;
        for(int i=0;i<max;i++){
            while(count[i]!=0){
                arr[pos]=i;
                pos++;
                count[i]--;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr={2,5,3,8,0,5,1,7,6,5,9,3,11,12,6,4,23,9,9,0,45};
        int[] sArr=sort(arr);
        for(int i=0;i<sArr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}