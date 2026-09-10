class Solution {
    public int reverse(int x) {
        int number = x;
        long ans=0;
        int num;

        while(number!=0){
            num =number%10;
            ans=ans*10+num;
            number=number/10;
        }

          if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) {
            return 0;
        }


        return (int) ans;
        
    }
}