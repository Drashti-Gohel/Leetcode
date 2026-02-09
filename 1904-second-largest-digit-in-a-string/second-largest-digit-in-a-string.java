class Solution {
    public int secondHighest(String s) {
        int i;
        List<Integer> list = new ArrayList<>();
        Set<Integer> st = new HashSet<>();
        for(i=0;i<s.length();i++){
             int num = Character.getNumericValue(s.charAt(i)); 
            if(num>=0 && num<=9){
 
                    if(!st.contains(num)){

                    st.add(num);
                System.out.print(num);
                list.add(num);
                    }
            }
        }
  System.out.print(list);
       Collections.sort(list);
       if(list.size()>1){
         int nm = list.get(list.size()-2);
       
        return nm;
       }
       return -1;
    }
   
}