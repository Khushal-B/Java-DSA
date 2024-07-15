
import java.util.Scanner;
public class greetings {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        String s= sc.nextLine().trim();
        System.out.println("Hello dear "+ s);

    }
}
