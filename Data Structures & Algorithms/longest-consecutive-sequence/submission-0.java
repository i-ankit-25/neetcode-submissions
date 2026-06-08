class Solution {
    public int longestConsecutive(int[] nums) {
        int maxLength = 0;
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            int numberUnderConsideration = nums[i];
            int currentMaxLength = 1;
            for(int j=i+1; j<nums.length; j++){
                if(nums[j] - numberUnderConsideration == 1){
                    currentMaxLength++;
                    numberUnderConsideration = nums[j];
                }
            }
            if(maxLength < currentMaxLength){
                maxLength = currentMaxLength;
            }
        }
        return maxLength;
    }
}
