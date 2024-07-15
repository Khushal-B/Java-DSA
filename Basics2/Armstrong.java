

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        System.out.println("Enter no");
        int a = x.nextInt();
        int temp=a,k=1;
        int l=0,ans=0;
        while(temp>0){
            temp=temp/10;
            l++;
        }
        System.out.println("length is "+l);
        int num=a,b;
        while(a>0){
            b=a%10;
            a=a/10;
         //   ans=ans+(int)Math.pow(b,l);
            for(int i=1;i<=l;i++){
                k=k*b;
            }
            System.out.println(k);
            ans=ans+k;
            k=1;
        }
        if(ans==num){
            System.out.println("yes armstrong "+ ans);
        }
        else{
            System.out.println("Not armstrong "+ ans);
        }
    }
}
