class Solution {
    public int majorityElement(int[] nums) {

       int n = nums.length;

     int count = 0;
     int maj = 0;
     for(int i=0;i<n;i++){
       if(count==0){
        maj = nums[i];
       }

       if(maj== nums[i]){
        count++;
       }else{
        count--;
       }
        
    
    }
    return maj;
    }
}