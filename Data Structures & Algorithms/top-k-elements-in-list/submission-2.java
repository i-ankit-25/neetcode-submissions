class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for(int num: nums){
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        List<Integer>[] bucket = new List[nums.length + 1];
        for(int i=0; i<nums.length + 1; i++){
            bucket[i] = new ArrayList<>();
        }
        for(int key : frequencyMap.keySet()){
            int value = frequencyMap.get(key);
            bucket[value].add(key);
        }
        int[] result = new int[k];
        int j = 0;
        for(int i=nums.length; i>0; i--){
            for(int num : bucket[i]){
                result[j++] = num;
            }
            if(j==k){
                break;
            }
        }
        return result;
    }
}
