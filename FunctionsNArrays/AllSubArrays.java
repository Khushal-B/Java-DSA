public class AllSubArrays {
    public static void printSubArray(int[] args) {
        for(int i=0; i<args.length;i++){
            for(int j=i;j<args.length;j++){
                System.out.print("(");
                for(int k=i;k<=j;k++){

                    if(k==j){
                        System.out.print(args[k]);
                        break;
                    }

                    System.out.print(args[k]+",");
                    
                }
                System.out.print(") ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        printSubArray(arr);
    }
}
