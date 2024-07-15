import java.util.*;
public class LinearSearch {

    public static boolean linearsearch(String[] arr, String str){
        for(int i=0;i<arr.length;i++){
            if(arr[i].equalsIgnoreCase(str))
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter: ");
        String str=sc.next();
        String[] arr={"Apple","Ball","Cat"};
        int x=Integer.MIN_VALUE;

        if(linearsearch(arr,str))
        System.out.println("Present");
        else
        System.out.println(x);
    }
}
