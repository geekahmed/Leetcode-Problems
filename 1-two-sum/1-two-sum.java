class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> c = new HashMap();
        
        for(int i = 0; i < nums.length; i++){
            if( c.containsKey(target - nums[i])){
                return new int[]{c.get(target-nums[i]), i};
            }
            
            c.put(nums[i],i);
        }
        
        
        return new int[]{0,0};
        
    }
}