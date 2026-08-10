class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[]arr=stones.toCharArray();
        char[]x=jewels.toCharArray();

        HashMap <Character,Integer> map = new HashMap<>();

        for (int i=0;i<x.length;i++){
            map.put(x[i],map.getOrDefault(x[i],0)+1);

        }
        int output=0;

        for (int i =0;i<arr.length;i++){
            if (map.containsKey(arr[i])){
                output++;

            }

        }
        return output;
        
    }
}