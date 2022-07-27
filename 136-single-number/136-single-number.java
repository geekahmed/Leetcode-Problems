class Solution {
    public int singleNumber(int[] nums) {
        int x0 = nums[0];
        for(int i = 1; i < nums.length; i++){
            x0 = x0 ^ nums[i];
        }
        return x0;
    }
}