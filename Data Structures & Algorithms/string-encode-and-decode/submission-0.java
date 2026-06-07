class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        for(String word: strs) {
            int length = word.length();
            encodedString.append(length).append('#').append(word);
        }
        return encodedString.toString();
    }

    public List<String> decode(String str) {
        List<String> decodedStrings = new ArrayList<>();
        int i =0;
        while(i < str.length()){
            int j = str.indexOf('#', i);
            int length = Integer.parseInt(str.substring(i, j));
            decodedStrings.add(str.substring(j+1, j+length+1));
            i=j+length+1;
        }
        return decodedStrings;
    }
}
