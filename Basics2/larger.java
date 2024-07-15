
import java.util.Scanner;

public class larger {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,max;
        a=sc.nextInt();
        b= sc.nextInt();
        if(a>b){
             max = a;
        }
        else if (b>a){
             max = b;
        }
        else{
            max=1;
        }
       // System.out.println("big is "+ max);
       int  x=Math.max(a,b);
        System.out.println("big no is "+ x);
    }
}
