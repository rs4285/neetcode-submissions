class Solution {
    public int[] getConcatenation(int[] nums) {
      int n = nums.length;
      ArrayList<Integer> list = new ArrayList<>();
      for(int num: nums){
        list.add(num);
      }
      for(int num: nums){
        list.add(num);
      }
      int[] ans = new int[list.size()];
      for(int i=0;i<list.size();i++){
        ans[i] = list.get(i);
      }
      return ans;
    }
}