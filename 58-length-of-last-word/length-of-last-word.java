class Solution {
    public int lengthOfLastWord(String s) {
        StringBuilder rev = new StringBuilder(s);
        String reversed =  rev.reverse().toString();
        System.out.print(reversed);
        int count =0;
        
        for(int i=0;i<reversed.length();i++){
            if(count==0 && reversed.charAt(i)==' '){
                continue;
            }
            if(count>0 && reversed.charAt(i)==' '){
                break;
            }
            else{
               count++;
            }
        }
        return count;
    }
}