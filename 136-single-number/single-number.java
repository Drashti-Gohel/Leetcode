class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            boolean swapped = false;
            for(int j=0;j<n-i-1;j++){
            if(nums[j]>nums[j+1]){
                int temp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = temp;
                swapped =true;
            }
        }
        if(!swapped){break;}
        }

        int num = 0;
          if(n==1){
                num = nums[0];
            }
            for(int i=0;i<n;i++){
                System.out.print(nums[i]+" ");
            }
        for(int i=0;i<n;i++){
          
          if(i<n-1){
            if(nums[0]!=nums[1]){
            num=nums[0];
          }
            if(nums[i]==nums[i+1]){
                i++;
               
            } 
            else{
                num = nums[i];
            }}
            if(num==0 && i==n-2){
                num = nums[++i];
            }
        }
        return num;
    }
}