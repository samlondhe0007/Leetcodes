class Solution {
    public int maximumCount(int[] nums) {
        int maxcount=0;
        int minimumcount =0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]<0){
                minimumcount++;
            }
            else if(nums[i]>0){
                maxcount++;
                 }
        }

        int Max = Math.max(maxcount,minimumcount);
        return Max; 
    }
}