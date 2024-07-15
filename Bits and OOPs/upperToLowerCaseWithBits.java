public class upperToLowerCaseWithBits {
    public static char convert (char ch){
        int c=ch;
        int bitMask=1<<5;
        c=c|bitMask;
        return (char)c;

    }
    public static void main(String[] args) {
        System.out.println(convert('D'));
    }
    
}
