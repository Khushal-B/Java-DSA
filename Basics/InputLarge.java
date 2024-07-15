
import java.util.Scanner;

public class InputLarge {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=n;
        while(n!=0){
            n=sc.nextInt();
            if(n>max && n!=0)
                max=n;

        }
        System.out.println(max);
    }
}
