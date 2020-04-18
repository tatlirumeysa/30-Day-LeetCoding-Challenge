class Solution {
    public int maxProfit(int[] prices) {
        int max = 0; 
        if(prices.length == 0) return 0;
        for(int i = 0; i< prices.length; i++){
            int maxProfit = 0;
            for(int j = i+1; j<prices.length;j++){
                if(prices[i] < prices[j])
                    int profit = maxPro
            }
        }
    }
}