class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int maxLength = 0, length = 0;
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++){
            if(nums[i+1] - nums[i] == 1){
                length++;
            } else if(nums[i+1] - nums[i] == 0) {
                continue;
            } else {
                if(maxLength < length){
                    maxLength = length;
                }
                length = 0;
            }
        }
        maxLength = Math.max(maxLength, length);
        return maxLength+1;
    }
}
