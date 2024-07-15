public class CountInversions {
        public static long cnt=0;
        public static void main(String[] args) {
            long[] arr={7,72,90,21,60};
            mergeSort(arr,0,4);
           System.out.println(cnt);
           for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"");
        }
        } 

        public static void mergeSort(long[] arr, int start, int end){
            if(start>=end){
                return ;
            }
            int mid=start+(end-start)/2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);
            long[] temp=new long[end-start+1];
            int i=start,j=mid+1,d=0;
            for(int k=0;k<temp.length;k++){
                if(d==0){
                    if(arr[i]<=arr[j]){
                        temp[k]=arr[i];
                        i++;
                        if(i==mid+1)
                            d=1;
                    }else{
                        cnt=cnt+(mid-i+1);
                        temp[k]=arr[j];
                        j++;
                        if(j==end+1)
                            d=2;
                    }
                }else{
                    if(d==1){
                        temp[k]=arr[j];
                        j++;
                    }else{

                        temp[k]=arr[i];
                        i++;
                    }
                }
    
            }
            for(int z=start,x=0;z<=end;z++,x++){
                arr[z]=temp[x];
            }
        }
    
}
