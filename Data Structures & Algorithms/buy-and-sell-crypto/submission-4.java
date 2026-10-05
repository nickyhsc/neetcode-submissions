class Solution {
    public int maxProfit(int[] prices) {
        //O(n) solution
        int maxProfit = 0;
        int minPrice = prices[0];
        for(int i=0; i<prices.length; i++){
            maxProfit = Math.max(maxProfit, prices[i]-minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return maxProfit;
    }
}
