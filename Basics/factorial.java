

import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int fact=1;
    while(n!=1){
        fact=fact*n;
        n--;
    }
        System.out.println(fact);

    }
}
