class factorial{
    public static void main(String[] args) {
        System.out.println("The factorial is "+fact(4));
    }
    public static int fact(int num){
        if(num<=1)
            return 1;
        return num*fact(num-1);
    }
}