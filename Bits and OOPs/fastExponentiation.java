class fastExponentiation{
    public static int power(int a,int b){
        int ans=1;
        while(b>0){
            if((b&1) != 0)
                ans=ans*a;
            a=a*a;
            b=b>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Ans: "+power(0,7));
    }
}