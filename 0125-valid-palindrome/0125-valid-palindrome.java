class Solution {
    public boolean isPalindrome(String s) {
        if (s.length()==1){
            return true;
        }

        StringBuilder sb = new StringBuilder();

        for (int i=0;i<s.length();i++){
            if (s.charAt(i)>='a' && s.charAt(i)<='z'){
                sb.append(s.charAt(i));
            }
            else if (s.charAt(i)>='A' && s.charAt(i)<='Z'){
                sb.append(s.charAt(i));

            }
            else if (s.charAt(i)>='0' && s.charAt(i)<='9'){
                sb.append(s.charAt(i));

            }

        }
            String str = sb.toString().toLowerCase();
            int start=0;
            int end =str.length()-1;

            while (start<end){
                if (str.charAt(start)!=str.charAt(end)){
                    return false ;

                }
                start++;
                end--;


            }
        return true;
    }
}