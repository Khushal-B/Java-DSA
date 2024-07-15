
import java.util.Scanner;

public class fibinacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 1, c, i;
        System.out.println("Enter n");
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("0");
        } else if (n == 2) {
            System.out.println("0,1");
        } else {
            System.out.print("0,1,");

            for (i = 1; i <= n - 2; i++) {
                c = a + b;
                a=b;
                b=c;
                System.out.print(c + ",");
            }
        }
    }
    }

