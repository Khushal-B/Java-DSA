
import java.util.*;
public class SimpleInterest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter p,t,and r");
        float p=sc.nextFloat();
        double t=sc.nextFloat();
        float r=sc.nextFloat();
        double a=p+p*t*r/100;
        float i=(float)a-p;
        System.out.println("the amount is "+a+" and interest is "+i);

    }
}
