public class BinaryStrings {
    public static void main(String[] args) {
        int n=6;
        printBinaryStrings((int)Math.pow(2, n)-1,n);
    }
    public static void printBinaryStrings(int num,int dig){
        if(num==0){
            printThisInBin(num,dig);
            return;
        }
        if(checkConsecutive(num)){
            printThisInBin(num,dig);
        }
        printBinaryStrings(num-1, dig);
        return;
        
    }

    public static void printThisInBin(int num,int dig){
        for(int i=dig-1;i>=0;i--){
            int bitMask=1<<i;
            int temp=(num&bitMask)>>i;
            System.out.print(temp);
        }
        System.out.println();

    }
    public static boolean checkConsecutive(int num){
        for(int i=(int)Math.ceil((Math.log(num+1) / Math.log(2)))-1;i>0;i--){
            int bitMask=1<<i;
            int temp=(num&bitMask)>>i;
            int temp2=(num&(bitMask>>1))>>(i-1);
            if(temp==temp2 && temp==1)
                return false;
        }
        return true;
    }
    
}
