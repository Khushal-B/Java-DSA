import java.util.Scanner;

public class ReverseArray {
    public static int[] Reverse(int[] arr){
        int temp, l=arr.length;
        for(int i=0;i<l/2;i++){
            temp=arr[i];
            arr[i]=arr[l-i-1];
            arr[l-i-1]=temp;
        }
        return arr;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={12,15,1,333,400,0};
        int[] rev=Reverse(arr);
        for(int i=0;i<rev.length;i++){
            System.out.print(rev[i]+" ");
        }
    }
}
