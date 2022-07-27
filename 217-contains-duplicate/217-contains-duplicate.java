class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Boolean> freqs = new HashMap<Integer, Boolean>();
        boolean dup = false;
        for(int i: nums){
            if(freqs.get(i) == null){
                freqs.put(i, true);
            } else{
                dup = true;
                break;
            }
        }
        return dup;
        
    }
}