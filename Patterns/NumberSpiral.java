import java.util.*;

public class NumberSpiral {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no: ");
        int n=sc.nextInt();
        sc.close();
        int val,row,col;

        for(int i=1;i<=2*n-1;i++){
            for(int j=1;j<=2*n-1;j++){
                row=i>n?2*n-i:i;
                col=j>n?2*n-j:j;
                val=col>row?n-row+1:n-col+1;
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}
