public class sum {
    public static void main(String[] args) {
        System.out.println("The sum is "+sums(5));
    }
    public static int sums(int num){
        if(num==0)
            return 0;
        return num+sums(num-1);
    }
    
}
