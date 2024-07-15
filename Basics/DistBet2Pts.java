
import java.util.Scanner;

public class DistBet2Pts {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,c,d;
        float ans;
        System.out.println("Enter coordinates of 1st point");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Enter coordinates of 2nd point");
        c=sc.nextInt();
        d=sc.nextInt();
        ans= (float) Math.sqrt((float)((((a-c)*(a-c))+Math.pow(Math.abs(b-d),2))));
        System.out.println(ans);
    }
}
