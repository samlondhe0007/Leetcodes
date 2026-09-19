class Solution {
    public int maxProfit(int[] prices) {
      int maxValue[]=new int[prices.length] ;

      int n=prices.length;

      maxValue[n-1]=prices[n-1];

      for (int i=n-2;i>=0;i--){
        maxValue[i] = Math.max(maxValue[i+1],prices[i]);
      }    

      int ans  =0;

      for (int i=0;i<prices.length;i++){
        int currentProfit  = maxValue[i]-prices[i];
        ans = Math.max(ans,currentProfit);


      }

      return ans;
    }
}