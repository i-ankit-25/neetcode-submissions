class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> sCharacterMap = new HashMap<>();
        for(char sChar : s.toCharArray()){
            sCharacterMap.put(sChar, sCharacterMap.getOrDefault(sChar, 0) + 1);
        }

        Map<Character, Integer> tCharacterMap = new HashMap<>();
        for(char tChar : t.toCharArray()){
            tCharacterMap.put(tChar, tCharacterMap.getOrDefault(tChar, 0) + 1);
        }

        return sCharacterMap.equals(tCharacterMap);
    }
}
