class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s=s.toLowerCase();
        String reverse=new StringBuilder(s).reverse().toString();
        if (s.equals(reverse)){
           return true;
        }
        else{
            return false;
        }
    }
}