class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.length == 0 || nums.length == 1){
            return false;
        }
        Set<Integer> numSet = new HashSet<>();
        for(int num : nums){
            if(!numSet.contains(num)){
                numSet.add(num);
            } else {
                return true;
            }
        }
        return false;
    }
}