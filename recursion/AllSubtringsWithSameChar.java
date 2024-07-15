public class AllSubtringsWithSameChar {
    public static int c=0;
    public static void main(String[] args) {
        String str="abcab";
        printSubStrings(str,0);
    }
    public static void printSubStrings(String s,int i){
        if(i==s.length())
            return;
        System.out.println(s.charAt(i));
        goDown(s,i,s.charAt(i)+"");
        printSubStrings(s, i+1);
    }
    public static void goDown(String s, int i, String str){
        if(i==s.length()-1)
            return;
        str=str+s.charAt(i+1);
        if(str.charAt(0)==str.charAt(str.length()-1))
        System.out.println(str);
        goDown(s, i+1, str);
    }
}
