class Solution {
    public boolean isValid(String s) {
         Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
           Character ch = s.charAt(i);
           
            if(ch=='('||ch=='{'||ch=='['){

                st.push(ch);
            }else{
                if(st.empty()){
                    return false;
                }
            }
             if(ch==')' && !st.empty()){

                if(st.peek()=='('){
                    st.pop();
                }else{
                    return false;
                }
            }
              if(ch=='}' && !st.empty()){

                if(st.peek()=='{'){
                    st.pop();
                }else{
                    return false;
                }
              }
             if(ch==']' && !st.empty()){

                if(st.peek()=='['){
                    st.pop();
                }else{
                    return false;
                }
            }
          
           
        }
        if(st.empty()){
                 return true;
        }
        else{
            return false;
        }
      
    }
}