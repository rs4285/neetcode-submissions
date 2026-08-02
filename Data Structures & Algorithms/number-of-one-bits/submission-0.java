class Solution {
    public int hammingWeight(int n) {
        int i=0;
        int count = 0;
        while(n>0){
            i = n % 2;
            n = n/2;
            if(i==1){
                count++;
            }
        }
        return count;
    }
}
