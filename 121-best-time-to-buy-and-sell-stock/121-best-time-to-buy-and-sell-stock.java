class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int curr_val = prices[0];
        for(int i=1;i<prices.length;i++){
            if(curr_val < prices[i]){
                maxProfit = Math.max(maxProfit, prices[i]-curr_val);
            }
            else{
                curr_val = prices[i];
            }
        }
        return maxProfit;
    }
}
