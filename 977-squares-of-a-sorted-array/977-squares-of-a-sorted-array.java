class Solution {
    public int[] sortedSquares(int[] nums) {
        int start = 0, end = nums.length - 1, aux = nums.length - 1;
        int[] result = new int[nums.length];
        
        while(start <= end){
            
            if(Math.abs(nums[start]) > Math.abs(nums[end])){
                result[aux] = (int) Math.pow(nums[start], 2);
                start++;
            } else {
                result[aux] = (int) Math.pow(nums[end], 2);
                end--;
            }
            aux--;
        }
        return result;
    }
}