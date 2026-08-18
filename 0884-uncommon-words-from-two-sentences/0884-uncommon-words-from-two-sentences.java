class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {

        HashMap<String ,Integer> map = new HashMap<>();
         for (String  i:s1.split(" ")){
            map.put(i,map.getOrDefault(i,0)+1);
         }
         for (String i:s2.split(" ")){
            map.put(i,map.getOrDefault(i,0)+1);
         }

         List<String > list = new ArrayList<>();

         for (String i:map.keySet()){
            if (map.get(i)==1){
                list.add(i);
            }
         }

         return list.toArray(new String[0]);
    }
}