public class MaxProfit {
    static int sellAndBuyPrice(int[] prices){
        int BuyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0;i<prices.length;i++){
            if(BuyPrice < prices[i]){
                int profit = prices[i] - BuyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }else{
                BuyPrice = prices[i];
            }
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] ={7,1,2,3,4,5,6};
        System.out.println();
        System.out.println(sellAndBuyPrice(prices));
    }
}
