class TrappingRainwater {
    public static int trap(int[] height) {
        int max = 0, sum = 0, cont=0,pos=0;
        for (int i = 0; i < height.length; i++) {

            for (int j = i+1; j < height.length; j++) {
                if(height[j]>max){
                    max=height[j];
                    pos=j;
                }

                if (height[j] >= height[i]) {
                    for (int k = i + 1; k < j; k++) {

                        sum += height[k];
                    }
                    cont =cont+ ((j-i- 1) * height[i]) - sum;
                    sum = 0;
                    i=j-1;
                    max=0;
                    break;
                }
            }
            if(max!=0){
                for (int k = i + 1; k < pos; k++) {

                    sum += height[k];
                }
                cont =cont+ ((pos-i- 1) * height[pos]) - sum;
                sum = 0;
                i=pos-1;
                max=0;
            }

        }
        return cont;
    }

    public static void main(String[] args) {
        int[] height ={0,1,0,2,1,0,1,3,2,1,2,1};
        int ans=trap(height); 
        System.out.println("Ans is "+ans);
    }
}