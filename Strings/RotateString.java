
class RotateString {
    public static boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())
            return false;
        int i=0,k=0;
        for(k=0;k<s.length();k++){
            if(s.charAt(i)==goal.charAt(k))
                i++;
            else
                i=0;
        }
        int l=s.length();
        if((s.substring(i,l)).equals(goal.substring(0,l-i)))
            return true;


        i=0;
        for(k=0;k<s.length();k++){
            if(goal.charAt(i)==s.charAt(k))
                i++;
            else
                i=0;
        }
        if((goal.substring(i,l)).equals(s.substring(0,l-i)))
            return true;

        
        return false;
    }
    public static void main(String[] args) {
        System.out.println(rotateString("bbbacddceeb","ceebbbbacdd"));
    }
}