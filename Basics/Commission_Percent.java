
import java.util.Scanner;

public class Commission_Percent {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amt and com %");
        int amt=sc.nextInt();
        int per=sc.nextInt();
        float ans=(float)amt*per/100;
        System.out.println(ans);
    }
}
