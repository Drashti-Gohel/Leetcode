class Solution {
    public boolean isHappy(int n) {
        Set <Integer>  usedInt = new HashSet<>();
        while(true){
      int sum = 0 ;
     
     
      while(n>0){
        int rem =  n%10;
        sum = sum+ (rem*rem);
        n = n/10;
      }
     
      if(sum==1){
        return true;
      }else{
        n = sum;
       
        if(usedInt.contains(n)){
             return false;
        }
        usedInt.add(n);
       
      }
        }
    }
}