class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] sFrequency = new int[26];
        for(char sChar : s.toCharArray()){
            sFrequency[sChar - 97]++;
        }

        int[] tFrequency = new int[26];
        for(char tChar : t.toCharArray()){
            tFrequency[tChar - 97]++;
        }

        for(int i=0; i<26; i++){
            if(sFrequency[i] != tFrequency[i]){
                return false;
            }
        }

        return true;
    }
}
