class StockProfit {
    public static int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE, profit=0;
        for(int i=0;i<prices.length;i++){
            min=Math.min(min,prices[i]);
            profit=Math.max(profit,(prices[i]-min));
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        int n=maxProfit(prices);
        System.out.println(n);
    }
}
