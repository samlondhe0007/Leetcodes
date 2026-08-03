class Solution {
    public int removeElement(int[] nums, int val) {

        int count=0;
        int arr[]=new int [nums.length];
        for (int i=0;i<nums.length;i++){
            if (nums[i]!=val){

                arr[count]=nums[i];
                count ++;
                 
            }
        }
       for (int i=0;i<count;i++){
        nums[i]=arr[i];
        
       }
        return count;
      
    }
}