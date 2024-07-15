

import java.util.Scanner;

public class string_palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String st=sc.next().trim();
        String str="";
        char a;
        int x=st.length();
        for(int i=x-1;i>=0;i--)
        {
            a=st.charAt(i);
            str=str+a;
        }
        if(st.equals(str)){
            System.out.println("Yes palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
    }
}
