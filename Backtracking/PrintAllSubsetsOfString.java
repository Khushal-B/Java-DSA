public class PrintAllSubsetsOfString {
    public static void main(String[] args) {
        String str="abcde";
        printSubstrings(str,0,1);

    }
    public static void printSubstrings(String s,int i,int len){
        if(i>=s.length() || i+len>s.length())
            return;

        System.out.println(s.substring(i, i+len));
        printSubstrings(s, i+1, len);
        if(i==0)
        printSubstrings(s, i, len+1);
       

    }
}
