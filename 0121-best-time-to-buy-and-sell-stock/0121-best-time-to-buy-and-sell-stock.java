class Solution {
    public int maxProfit(int[] prices) {
         int minPrice=prices[0];
         int profit=0;
         
         for(int i=1;i<prices.length;i++){
            if(prices[i]<minPrice){
                minPrice=prices[i];

            }
            profit=Math.max(profit,prices[i]-minPrice);
            }
            return profit;
         }
         
    }
