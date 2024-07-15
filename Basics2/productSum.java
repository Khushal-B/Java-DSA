
import java.util.Scanner;
public class productSum {
        //public int subtractProductAndSum(int n) {
        public static void main(String[] args){

            Scanner sc=new Scanner(System.in);
            System.out.print("n = ");
            int n=sc.nextInt();
            int p=1,s=0,d,ans,temp=n;

            while(temp>0) {
                d=temp%10;
                p=p*d;
                s=s+d;
                temp=temp/10;
            }
            ans=p-s;
            System.out.print(ans);

            // }

        }
    }
