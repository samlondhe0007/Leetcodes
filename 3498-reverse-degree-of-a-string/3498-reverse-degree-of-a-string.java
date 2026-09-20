class Solution {
    public int reverseDegree(String s) {
        LinkedHashMap <Character,Integer> map = new LinkedHashMap <>();
        int indexValue=26;
        int sum=0;
        for (char ch='a';ch<='z';ch++){
            map.put(ch,indexValue);
            indexValue--;
        }

        char arr[]=s.toCharArray();
        for (int i=0;i<arr.length;i++){
            sum=sum+map.get(arr[i])*(i+1);
        }
        return sum;
    }
}