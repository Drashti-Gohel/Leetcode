class Solution {
    public boolean isPalindrome(String s) {
        String low =  s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder sb = new StringBuilder(low);
        String rev  = sb.reverse().toString();
      for(int i=0;i<low.length();i++){
        if(low.charAt(i)!=rev.charAt(i)){
            return false;
           
        }
      }
      return true;
         

  
    }
}