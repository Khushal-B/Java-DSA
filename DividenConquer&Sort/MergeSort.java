/**
 * MergeSort
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] arr={4,2,6,9,3,5,0,0,9};
        int[] sortedArr=mergeSort(arr,0,arr.length-1);
        for(int i=0;i<sortedArr.length;i++){
            System.out.print(sortedArr[i]+"");
        }
    }

    public static int[] mergeSort(int[] arr, int start, int end){
        if(start>=end){
            int[] ary={arr[start]};
            return ary;
        }
        int mid=start+(end-start)/2;
        int[] leftArr=mergeSort(arr, start, mid);
        int[] rightArr=mergeSort(arr, mid+1, end);
        int[] temp=new int[leftArr.length+rightArr.length];
        int i=0,j=0,d=0;
        for(int k=0;k<temp.length;k++){
            if(d==0){
                if(leftArr[i]<rightArr[j]){
                    temp[k]=leftArr[i];
                    i++;
                    if(i==leftArr.length)
                        d=1;
                }else{
                    temp[k]=rightArr[j];
                    j++;
                    if(j==rightArr.length)
                        d=2;
                }
            }else{
                if(d==1){
                    temp[k]=rightArr[j];
                    j++;
                }else{
                    temp[k]=leftArr[i];
                    i++;
                }
            }

        }
        return temp;
    }
}






// class MergeSort {
//     public static long cnt=0;
//     public static void main(String[] args) {
//         long[] arr={4,2,6,0,9};
//         long[] sortedArr=mergeSort(arr,(long)0,(long)arr.length-1);
//         for(int i=0;i<sortedArr.length;i++){
//             System.out.print(sortedArr[i]+"");
//         }
//     }
        
        
//     static long[] mergeSort(long arr[], long start, long end){
//         if(start>=end)
//             return arr;
        
//         long mid=start+(end-start)/2;
//         long[] temp1=mergeSort(arr,start,mid);
//         long[] temp2=mergeSort(arr,mid+1,end);
//         int p=0,q=0,dr=0,i=(int)start;
        
//         while(p<temp1.length && q<temp2.length){
            
//             if(dr==0 && temp1[p]<temp2[q]){
//                 arr[i]=temp1[p];
//                 p++;
//                 i++;
//                 if(p>=temp1.length) dr=1;
                
//             }else if(dr==0){
//                 arr[i]=temp2[q];
//                 q++;
//                 i++;
//                 if(q>=temp2.length) dr=2;
//             }
//         }
//         if(dr==1){
//             for(;i<=end;i++){
//                 arr[i]=temp2[q];
//                 q++;
//             }
//         }else if(dr==2){
//                 for(;i<=end;i++){
//                 arr[i]=temp1[p];
//                 p++;
//             }
//         }
//         return arr;        
//     }
// }