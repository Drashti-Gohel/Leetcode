
class Solution {
    public int lengthOfLongestSubstring(String s) {
      List<Character> list = new ArrayList<>();
        int maxLen = 0;
        int start = 0;
        int end =0;
       while(end<s.length()){

        if(!list.contains(s.charAt(end))){

            list.add(s.charAt(end));
            end++;
            maxLen = Math.max(maxLen , list.size());
        }
        else{

            list.remove( Character.valueOf(s.charAt(start)));
            start++;
        }
       }

       return maxLen;
    }
}