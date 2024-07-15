class fibonacci{
    public static void main(String[] args) {
        System.out.println("The fibonacci value is "+fibo(7));
    }
    public static int fibo(int n){
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        return fibo(n-1)+fibo(n-2);
    }
}