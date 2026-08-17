class Solution {
    public int[] findErrorNums(int[] nums) {
       HashSet <Integer> set = new HashSet<>();

       int duplicate =-1;
       int sum =0;
       int n=nums.length;

       for (int i=0;i<nums.length;i++){
        if (!set.add(nums[i])){
            duplicate  = nums[i];
        }
        sum = sum+nums[i];
       }

       int expected =n*(n+1)/2;

       int missing = expected - (sum - duplicate);

       return new int []{duplicate,missing };
    }
}