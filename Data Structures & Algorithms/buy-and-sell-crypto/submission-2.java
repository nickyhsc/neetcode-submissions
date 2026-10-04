class Solution {
    public int maxProfit(int[] prices) {
        /*
        int profit = 0;
        for(int i=0; i<prices.length; i++){
            for(int j=i+1; j<prices.length; j++){
                if((prices[j]-prices[i])>profit && (prices[j]-prices[i]>0)){
                    profit = prices[j]-prices[i];
                }
            }
        }
        return profit;
        */
        int maxProfit = 0;
        int minPrice = prices[0];
        for(int i=0; i<prices.length; i++){
            maxProfit = Math.max(maxProfit, prices[i]-minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return maxProfit;
    }
}
