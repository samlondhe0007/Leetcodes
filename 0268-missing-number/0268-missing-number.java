class Solution {
    public int missingNumber(int[] nums) {
        int currentsum=0;

        for (int i=0;i<nums.length;i++){
            currentsum=currentsum+nums[i];

        }

        int actualsum = nums.length*(nums.length+1)/2;

       int  missingNumber =actualsum-currentsum;

        return missingNumber; 

        
    }
}   