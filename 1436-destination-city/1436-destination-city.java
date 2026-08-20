class Solution {
    public String destCity(List<List<String>> paths) {

      HashSet <String > source = new HashSet <>();

      for (List<String> i:paths){
           source.add(i.get(0));
      }

      for (List<String> i:paths){
        if (!source.contains(i.get(1))){
            return i.get(1);
        }
      }
      return "";
    }
}