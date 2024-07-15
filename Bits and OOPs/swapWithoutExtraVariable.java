
public class swapWithoutExtraVariable {
    public static void swap(int a, int b){
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a is = "+a);
        System.out.println("b is = "+b);
    }

    public static void main(String[] args) {
        swap(4,10);
    }
    
}
