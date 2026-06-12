class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int i=0; i<numbers.length; i++){
            int valueToSearch = target - numbers[i];
            Integer previousIndex = numMap.get(valueToSearch);
            if(previousIndex != null){
                return new int[]{previousIndex+1, i+1};
            }
            numMap.put(numbers[i], i);
        }
        throw new IllegalArgumentException("Notfound");
    }
}
