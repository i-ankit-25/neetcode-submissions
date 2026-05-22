class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groupedAnagrams = new ArrayList<>();
        Set<Integer> seenIndex = new HashSet<>();
        for(int i=0; i<strs.length; i++){
            if (seenIndex.contains(i)) { 
                continue; 
            }
            int[] strFrequencyArray = getFrequencyArray(strs[i]);
            List<String> subGroupedAnagrams = new ArrayList<>();
            subGroupedAnagrams.add(strs[i]);
            for(int j=i+1; j<strs.length; j++){
                if(seenIndex.contains(j)){
                    continue;
                }
                int[] str2FrequencyArray = getFrequencyArray(strs[j]);
                if(Arrays.equals(strFrequencyArray, str2FrequencyArray)){
                    subGroupedAnagrams.add(strs[j]);
                    seenIndex.add(j);
                }
            }
            groupedAnagrams.add(subGroupedAnagrams);
        }
        return groupedAnagrams;
    }

    private int[] getFrequencyArray(String str){
        int[] frequencyArray = new int[26];
        for(char ch : str.toCharArray()){
            frequencyArray[ch - 'a']++;
        }
        return frequencyArray;
    }
}
