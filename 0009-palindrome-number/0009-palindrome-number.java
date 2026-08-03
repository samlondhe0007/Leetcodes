class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        if (n<0){
            return false;
        }
        int rev=0;
        while (n>0){
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }

        if (rev==x){
          return true;
        }
        else{
          return  false;
        }
    
    }
}