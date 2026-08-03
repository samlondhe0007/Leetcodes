import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>map1=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            if (map1.containsKey(complement)){
                return new int []{map1.get(complement ),i};

            }
            else {
                map1.put(nums[i],i);
            }
        }
        throw new IllegalArgumentException ("no match ");
    }
}