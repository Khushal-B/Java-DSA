import java.util.Scanner;

public class average {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,sum=0,cnt=1;
        n=sc.nextInt();
        while(n!=0){
            sum=sum+n;
            n=sc.nextInt();
            if(n!=0)
             cnt++;
        }
        sc.close();
        System.out.println((float)sum/cnt);
    }
}
