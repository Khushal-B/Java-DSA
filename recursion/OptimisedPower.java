public class OptimisedPower {
    public static void main(String[] args) {
        System.out.println("The ans is "+calcPower(3,4));
    }
    public static int calcPower(int n, int p){
        if(p==0)
            return 1;

        int temp=calcPower(n, p/2);

        if((p&1)==0)    
            return temp*temp;
         else
            return n*temp*temp;
    }
}
