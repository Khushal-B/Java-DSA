/**
 * TestBacktrack
 */
public class TestBacktrack {

    public static void main(String[] args) {
        int[] arr=new int[5];
        backtrack(arr,0);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }

    public static void backtrack(int[] arr,int i){
        if(arr.length==i)
            return;
        arr[i]=i+1;
        backtrack(arr, i+1);
        arr[i]-=2;
    }
}