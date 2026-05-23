class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for(int num: nums){
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        Queue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        for(int key : frequencyMap.keySet()){
            minHeap.add(new int[]{key, frequencyMap.get(key)});
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        int[] result = new int[k];
        for(int i=0; i<k; i++){
            result[i] = minHeap.poll()[0];
        }
        return result;
    }
}
