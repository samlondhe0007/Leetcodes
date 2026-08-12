class Solution {
    public String reverseWords(String s) {
          
     String[]arr=s.split(" ");
     String result="";
        for (int i=0;i<arr.length;i++){
            String reverse = "";
           for (int j = arr[i].length() - 1; j >= 0; j--) {
           reverse = reverse + arr[i].charAt(j);

            }
            result = result+reverse+" ";

        }
        return result.trim(); 
        
    }
}