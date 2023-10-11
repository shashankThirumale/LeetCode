class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min = Integer.MAX_VALUE;
        int currProf = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            currProf = prices[i] - min;
            if(maxProfit<currProf)
                maxProfit = currProf;
        }
        return maxProfit;
    }
}