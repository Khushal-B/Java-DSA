public class ModifiedBinarySearchForRotatedArray {
    public static void main(String[] args) {
        int[] arr={4,6,7,8,9,10,0,1,2,3}; //{8,9,0,1,2,3,4,5,6,7}
        int key=10;
        System.out.println(ModifiedBS(arr, key));
    }
    public static boolean ModifiedBS(int[] arr, int key){
        int start=0,end=arr.length-1;
        int mid;
        while(start<=end){
            
            mid=start+(end-start)/2;
            if(key==arr[mid])
                return true;

            if(arr[start]<=arr[mid]){                        //left is sorted

                if(key>=arr[start] && key<arr[mid]){         //element can be only in sorted part
                    end=mid-1;
                }
                else{                                        //element can only be in unsorted part
                    start=mid+1;
                }

            }else{                                           //right is sorted

                if(key>arr[mid] && key<=arr[end]){           //element can be only in sorted part
                    start=mid+1;
                }
                else{                                        //element can only be in unsorted part
                    end=mid-1;
                }
            }    
        }
        return false;
    }
}
