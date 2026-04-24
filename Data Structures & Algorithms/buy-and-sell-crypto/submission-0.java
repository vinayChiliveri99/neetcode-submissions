class Solution {
    public int maxProfit(int[] prices) {
        int maxVal = 0;
        int minVal = prices[0];

        for(int i=1; i<prices.length; i++) {
            int buy = Math.min(minVal, prices[i]);
            minVal = buy;
            maxVal = Math.max(maxVal, prices[i] - buy);
        }

        return maxVal;
    }
}
