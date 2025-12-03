class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()){
            return false; //no duplicates
        }
        char news[] = s.toCharArray();
        char newt[] = t.toCharArray();

        Arrays.sort(news);
        Arrays.sort(newt);

        return Arrays.equals(news,newt);

    }
}