public class CheckIfSorted {
    public static void main(String[] args) {
        int[] arr={2,4,5,7,18,9,22};
        System.out.println(checkSort(arr,arr.length));
    }
    public static boolean checkSort(int[] arr, int len){
        if(len<=1)
            return true;
        if(checkSort(arr, len-1) && arr[len-2]<arr[len-1])
            return true;
        return false;
    }
}
