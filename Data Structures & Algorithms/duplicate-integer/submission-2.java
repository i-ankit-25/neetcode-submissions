class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.length == 0 || nums.length == 1){
            return false;
        }
        int[] numsSorted = nums.clone();
        Arrays.sort(numsSorted);
        for(int i=0; i<nums.length - 1; i++){
            if(numsSorted[i] == numsSorted[i+1]){
                return true;
            }
        }
        return false;
    }
}