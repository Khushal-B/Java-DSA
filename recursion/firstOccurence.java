public class firstOccurence {
    public static void main(String[] args) {
        int[] arr={3,2,5,7,9,3};
        int key=3;
        System.out.println("The element present at "+findIndex(arr,key,0));
    }
    public static int findIndex(int[] arr,int key,int i){
        if(i>=arr.length)
            return -1;
        if(arr[i]==key)
            return i;
        return findIndex(arr,key,i+1);
    }
    
}
