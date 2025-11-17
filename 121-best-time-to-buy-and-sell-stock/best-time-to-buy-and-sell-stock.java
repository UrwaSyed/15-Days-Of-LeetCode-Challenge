class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length < 2){
            return 0;
        }
        int min = prices[0];
        int max = 0;

        for(int i = 1; i< prices.length; i++){
            int profit = prices[i] - min;
            if(profit > max){
                max = profit;
            }
            if(prices[i] < min){
                min = prices[i];
            }
        }
        return max;
    }
}