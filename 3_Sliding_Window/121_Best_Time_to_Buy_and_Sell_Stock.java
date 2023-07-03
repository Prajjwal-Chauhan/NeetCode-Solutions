// O(n) Time Complexity
class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int maxprofit = 0;
        int profit = 0;

        for(int i : prices){
            buy = Math.min(buy,i);
            profit = i - buy;
            maxprofit = Math.max(maxprofit,profit);
        }

        return maxprofit;
    }
}