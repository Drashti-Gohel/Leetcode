class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 0;
    int n=digits.length;
    for(int i=n-1;i>=0;i--){
        if(digits[i]<9){
             digits[i]++;
             return digits;
        }
        digits[i]=0;
    }

   
    int [] newnumber = new int[n+1];
    newnumber[0] = 1;
    return newnumber;
   
    }
}