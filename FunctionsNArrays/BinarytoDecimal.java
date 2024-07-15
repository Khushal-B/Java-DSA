import java.util.*;

public class BinarytoDecimal {

    static int Converter(int n){
        int temp, bin=0, cnt=0;
        while(n>0){
            temp=n%2;
            n/=10;
            bin=bin+(temp*(int)Math.pow(2,cnt));
            cnt++;
        }
        return bin;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter: ");
        int n=sc.nextInt();
        System.out.println("The decimal form is: "+Converter(n));


    }
}
