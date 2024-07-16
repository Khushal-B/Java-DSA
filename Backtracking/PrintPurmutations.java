/**
 * PrintPurmutations
 */
public class PrintPurmutations {

    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("abc");
        printAllPermutations(str,new StringBuilder(""),str.length());
    }
    public static void printAllPermutations(StringBuilder s,StringBuilder temp,int len){
        if(len==temp.length()){
            System.out.println(temp);
            return;
        }

        for(int i=0;i<s.length();i++){
            StringBuilder s2=new StringBuilder(s);
            StringBuilder temp2=new StringBuilder(temp);
            temp2.append(s2.charAt(i));
            s2.deleteCharAt(i);
            printAllPermutations(s2, temp2,len);
        }


    }
}