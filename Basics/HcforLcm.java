
import java.util.Scanner;

public class HcforLcm {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int ch=sc.nextInt();
        int num=sc.nextInt();
        int num2=sc.nextInt();
        int ans=1;
        switch (ch) {
            case 1 -> {
                if (num2 > num) {
                    int temp = num;
                    num = num2;
                    num2 = temp;
                }
                for (int k = num2; k >= 1; k--) {
                    if (num % k == 0 && num2 % k == 0) {
                        ans = k;
                        break;
                    }
                }
                System.out.println(ans);
            }
            case 2 -> {
                if (num2 > num) {
                    int temp = num;
                    num = num2;
                    num2 = temp;
                }
                for (int l = num; l <= num * num2; l++) {
                    if (l%num == 0 && l%num2 == 0) {
                        ans = l;
                        break;
                    }
                }
                System.out.println(ans);
            }
            default -> System.out.println("wrong ch");
        }
    }
}
