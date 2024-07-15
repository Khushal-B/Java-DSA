import java.util.*;
public class BinarySearch {
    public static String Bsearch(int[] a, int n) {
        int start=0, end=a.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(a[mid]==n)
            return "Present at "+mid;
            else if(n>a[mid])
            start=mid+1;
            else
            end=mid-1;

        }
        return "Absent";
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[] arr={2,4,5,7,8,9,10,14,15,18,19,22,23,24,26,30};
    System.out.print("Enter no: ");
    int num=sc.nextInt();
    System.out.println("The element is "+Bsearch(arr,num));
}    
}
