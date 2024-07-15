/**
 * QuickSort
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr={2,5,1,4,3};
        qSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+"");
    }

    public static void qSort(int[] arr,int start,int end){
        if(start>=end)
            return;
        int pivot=end,i=start-1;

        for(int j=start;j<=end;j++){
            
            if(arr[j]<=arr[pivot]){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        qSort(arr, start, i-1);
        qSort(arr, i+1, end);

    }
}