class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int maxLength = 0;
        Set<Integer> numSet = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            numSet.add(nums[i]);
        }
        for(int num: nums){
            if(!numSet.contains(num - 1)){
                int newNum = num, length = 1;
                while(numSet.contains(newNum+1)){
                    newNum++;
                    length++;
                }
                if(maxLength < length){
                    maxLength = length;
                }
            } else {
                continue;
            }
        }
        return maxLength;
    }
}
