import java.util.*;
public class CharTriangle {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch='A';

        System.out.println("Enter no: ");
        int n=sc.nextInt();
        sc.close();

        for(int i=1;true;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
                n--;
                if(n<=0)
                return;
            }
            System.out.println();
        }
    }
}