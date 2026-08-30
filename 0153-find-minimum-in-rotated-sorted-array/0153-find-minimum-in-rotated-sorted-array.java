class Solution {
    public int findMin(int[] nums) {
        // kadhi pan sorted array dila ki binary search suru kraycha
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int mid = left+(right-left)/2;
            if (nums[mid]>nums[right]){
               left=mid+1;
            }
            else{
                right=mid;
            }
        }
        return nums[left];
        
    }
}