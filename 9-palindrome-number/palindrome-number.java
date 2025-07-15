class Solution {
    public boolean isPalindrome(int x) {
        int a =x;
        int remainder = 0;
        while(x>0){
            int mod = x%10;
            remainder = remainder*10 + mod;
            x = x/10;
        }
        if(remainder == a){
            return true;
            
        }else{
            return false;
        }
    }
}