class Solution {
    public int maxProductDifference(int[] nums) {

        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;

        int low = Integer.MAX_VALUE;
        int secondlow = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {

            // Find largest and second largest
            if (nums[i] >= max) {
                secondmax = max;
                max = nums[i];
            } 
            else if (nums[i] > secondmax) {
                secondmax = nums[i];
            }

            // Find smallest and second smallest
            if (nums[i] <= low) {
                secondlow = low;
                low = nums[i];
            } 
            else if (nums[i] < secondlow) {
                secondlow = nums[i];
            }
        }

        return (max * secondmax) - (low * secondlow);
    }
}