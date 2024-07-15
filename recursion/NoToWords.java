public class NoToWords {
    public static void main(String[] args) {
        System.out.println("hi"+toWords(20947));
    }
    public static String toWords(int n){
        if(n==0)
            return "";
        int temp=n%10;
        n=n/10;
        String[] arr={"zero","one","two","three","four","five","six","seven","eight","nine"};
        return toWords(n)+" "+arr[temp];
    }    
}
