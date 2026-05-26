class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        int j = 0;

        //adding chars alternatively
        while(i < word1.length() && j < word2.length()){
            result.append(word1.charAt(i));
            result.append(word2.charAt(j));
            i++;
            j++;
        }
        //leftover from word1
        while(i < word1.length()){
            result.append(word1.charAt(i));
            i++;
        }

        //leftover from word2
        while(j < word2.length()){
            result.append(word2.charAt(j));
            j++;
        }
        return result.toString();
    }
}