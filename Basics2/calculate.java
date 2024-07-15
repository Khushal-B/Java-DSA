

import java.util.Scanner;

public class calculate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b;
        char ch;
        float ans=0;
        System.out.println("Enter 2 no");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Enter operation");
        ch=sc.next().trim().charAt(0);
        if(ch=='+'){
         ans=a+b;}
        else if (ch=='-') {
             ans=a-b;
        }
        else if(ch=='*'){
             ans=a*b;
        }
        else if(ch=='/'){
             ans=(float)a/b;
        }
        System.out.println("Ans is "+ ans);
    }
}
