class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
          int ele = nums[i];
          for(int j=0;j<n;j++){
              if(j==i){
                continue;
              }
              if(nums[j] == ele){
                return true;
              }
          }
        }
        return false;
    }
}