class Solution {
    public double findMaxAverage(int[] nums, int k) {
       
       double currentsum = 0 ;
       for (int i=0;i<k;i++){
        currentsum = currentsum + nums[i];
       }

       double maxSum = currentsum;

       for (int i=k;i<nums.length;i++){
        currentsum = currentsum + nums[i]-nums[i-k];
        maxSum = Math.max(maxSum,currentsum);


       }

       return maxSum/k;
    }
}