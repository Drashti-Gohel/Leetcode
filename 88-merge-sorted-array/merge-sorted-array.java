class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a =0;
        for(int i=m;i<m+n;i++){
            nums1[i] = nums2[a];
            a++;
        }
        for(int i=0;i<m+n-1;i++){
            boolean swapped = false;
            for(int j=0;j<m+n-i-1;j++){
            if(nums1[j]>nums1[j+1]){
               int temp = nums1[j];
               nums1[j] = nums1[j+1];
               nums1[j+1] = temp;
               swapped = true;
            }
            }
            if(!swapped){break;}
        }
    }
}