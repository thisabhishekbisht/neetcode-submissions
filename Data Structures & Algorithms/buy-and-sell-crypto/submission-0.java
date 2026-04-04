class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit =0;
        int minPrice =prices[0];
        int len = prices.length;

        if(len ==0 || len==1) return 0;
        for(int right =1; right <len; right++){
            int value = prices[right];
            if(value<minPrice){
                minPrice = value;
            }
            else
            {
                maxProfit = Math.max(maxProfit,prices[right]-minPrice);
            }
        }
        return maxProfit;
    }
}
