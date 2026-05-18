class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length <= 1){
            return nums;
        }
        for(int i=0; i<nums.length; i++){
            int firstNumber = nums[i];
            int secondNumber = target - nums[i];
            for(int j=0; j<nums.length; j++){
                if(i!=j && nums[j] == secondNumber){
                    return new int[]{Math.min(i, j), Math.max(i, j)};
                }
            }
        }
        return new int[2];
    }
}
