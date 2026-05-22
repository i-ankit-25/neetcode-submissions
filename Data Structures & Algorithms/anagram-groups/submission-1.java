class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> signatureMap = new HashMap<>();

        for (String str : strs) {
            String signature = getFrequencySignature(str);
            signatureMap.putIfAbsent(signature, new ArrayList<>());
            signatureMap.get(signature).add(str);
        }

        return new ArrayList<>(signatureMap.values());
    }

    private String getFrequencySignature(String str) {
        int[] frequencyArray = new int[26];
        for (char ch : str.toCharArray()) {
            frequencyArray[ch - 'a']++;
        }
        StringBuilder signature = new StringBuilder();
        char currentCharacter = 'a';
        for (int count : frequencyArray) {
            signature.append(currentCharacter).append(count);
            currentCharacter++;
        }
        return signature.toString();
    }
}
