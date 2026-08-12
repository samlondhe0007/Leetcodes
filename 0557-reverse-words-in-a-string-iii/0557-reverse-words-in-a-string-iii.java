class Solution {
    public String reverseWords(String s) {

        String[] arr = s.split(" ");
        String result = "";

        for (int i = 0; i < arr.length; i++) {

            StringBuilder sb = new StringBuilder(arr[i]);

            result = result + sb.reverse() + " ";
        }

        return result.trim();
    }
}