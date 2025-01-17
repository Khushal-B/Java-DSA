public class PivotedArrayBinarySearch {

        public static int search(int[] nums, int target) {
            int low=0,high=nums.length-1,mid;
    
            while(low<=high){
                mid=(low+high)/2;
                if(target==nums[mid])
                return mid;
                else if(nums[low]<=nums[mid]){
                    if(target>=nums[low] && target<nums[mid]){
                        high=mid-1;
                    }else{
                        low=mid+1;
                    }
    
                }else{
                    if(target>=nums[mid] && target<=nums[high]){
                        low=mid+1;
                    }else{
                        high=mid-1;
                    }
    
                }
               
            }
    
            return -1;
            
        }

        public static void main(String[] args) {
            int[] arr={3,1};
            
            System.out.println("Ans: "+search(arr, 1));
            
        }
    }

