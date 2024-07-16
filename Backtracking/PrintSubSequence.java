public class PrintSubSequence {
    public static void main(String[] args) {
        String str="abcd";
        printSubstrings(str,"",0);

    }
    public static void printSubstrings(String s,String str,int i){
        if(i>=s.length()){
            System.out.println(str);
            return;
        }

        printSubstrings(s, str, i+1);
        str=str+s.charAt(i);
        printSubstrings(s, str, i+1);
       

    }
}
