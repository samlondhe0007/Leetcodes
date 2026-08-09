class Solution {
    public void reverseString(char[] s) {
        int index=s.length-1;
        for (int i=0;i<s.length/2;i++){
            char temp =s[i];
            s[i]=s[index];
            s [index]=temp;
            index--;
        }
    }
}