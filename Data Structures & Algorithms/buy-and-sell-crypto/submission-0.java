class Solution {
    public int maxProfit(int[] prices) {
        int prev = 0;
        
        for (int i = 0; i < prices.length; i++) {
            int curr = 0;
            for (int j = i+1; j < prices.length; j++) {
                curr = prices[j] - prices[i];
                if (curr > prev) {
                    prev = curr;
                }
            }
        }
        return prev;
    }
}
