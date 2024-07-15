public class lastOccurence {
    public static void main(String[] args) {
        int[] arr={2,5,7,9};
        int key=3;
        System.out.println("The element present at "+findIndex(arr,key,arr.length-1));
    }
    public static int findIndex(int[] arr,int key,int i){
        if(i<0)
            return -1;
        if(arr[i]==key)
            return i;
        return findIndex(arr,key,i-1);
    }
    
}
