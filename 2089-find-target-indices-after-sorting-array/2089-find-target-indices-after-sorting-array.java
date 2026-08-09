class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {

        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = 0; j < nums.length - 1 - i; j++) {

                if (nums[j + 1] < nums[j]) {

                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
             List <Integer>l1=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                if (nums[i]==target){
                    l1.add(i);

                }

            }

        
        return l1;
        
    }
}