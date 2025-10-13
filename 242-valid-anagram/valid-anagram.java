class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> map1 = new HashMap<>();
       char [] arr = s.toCharArray();
       for(char c: arr){
        if(map1.containsKey(c)){
        map1.put(c,map1.get(c)+1);
        }else{
            map1.put(c,1);
        }

       }

         Map<Character,Integer> map2 = new HashMap<>();
       char [] arr1 = t.toCharArray();
       for(char c: arr1){
        if(map2.containsKey(c)){
        map2.put(c,map2.get(c)+1);
        }else{
            map2.put(c,1);
        }
        
       }

        if(map1.equals(map2)){
            return true;
        }
        return false;   
    }
}