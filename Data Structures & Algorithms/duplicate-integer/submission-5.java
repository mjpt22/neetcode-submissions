class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> exists = new HashSet<Integer>();

        for(int i = 0; i < nums.length; i++) {
            int x = nums[i];
            // unlike python, we have to use .contains method on a 
            // hash set to check if a value is contained within
            if (exists.contains(x)) {
                return true; 
            }
            exists.add(x);
        }
        return false; 
        
    }
}