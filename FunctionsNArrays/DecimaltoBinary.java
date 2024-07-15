import java.util.*;

public class DecimaltoBinary {

    static int Converter(int n){
        int temp, bin=0, cnt=1;
        while(n>0){
            temp=n%2;
            n/=2;
            bin=bin+temp*cnt;
            cnt*=10;
        }
        return bin;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter: ");
        int n=sc.nextInt();
        System.out.println("The binary form is: "+Converter(n));


    }
}