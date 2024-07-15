

import java.util.Scanner;

public class fibonaci2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1,temp;
        while(n-2>0){
            temp=b;
            b=a+b;
            a=temp;
            n--;
        }
        System.out.println(b);
    }
}
