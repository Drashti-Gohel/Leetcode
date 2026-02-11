class Solution {
    public int reverse(int x) {
        int n =Math.abs(x);
        long rev =0;
        while(n!=0){
           int lt = n%10;
            rev =rev*10 + lt;
            n=n/10;
        }

        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE) return 0;
        return x<0? (int)-rev: (int)rev;
    }
}