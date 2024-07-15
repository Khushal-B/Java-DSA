
import java.util.Scanner;

public class discount {
    public static void main(String[] args){
        Scanner sc=new Scanner((System.in));
        float d,mp,sp,dp;
        System.out.println("Enter mp and sp");
        mp=sc.nextFloat();
        sp=sc.nextFloat();
        d=mp-sp;
        dp=d/mp*100;
        System.out.println(dp+"%");
    }
}
