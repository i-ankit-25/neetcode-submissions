class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int valueToSearch = target - nums[i];
            if(numMap.containsKey(valueToSearch)){//We check before inserting to avoid using the same element twice.
                return new int[]{numMap.get(valueToSearch), i};
            }
            numMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No Solution Found");
    }
}
