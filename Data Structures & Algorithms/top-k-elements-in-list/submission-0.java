class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for(int num: nums){
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        List<int[]> arr = new ArrayList<>();
        for(int key : frequencyMap.keySet()){
            arr.add(new int[]{key, frequencyMap.get(key)});
        }
        Collections.sort(arr, (a, b) -> b[1] - a[1]);
        int[] result = new int[k];
        for(int i=0; i<k; i++){
            result[i] = arr.get(i)[0];
        }
        return result;
    }
}
