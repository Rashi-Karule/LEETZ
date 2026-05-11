class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while(left < right) { //loop aage badhne ke liye for checking every charac
        //ignore non alphanumeric charac from left
        while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
            left++;
        }
        //ignore ..... charac from right
        while(right > left && !Character.isLetterOrDigit(s.charAt(right))){
            right--;
        }
        //compare karo
        if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
            return false;
        }
        else {
        left++;
        right--;
        }
    }
    return true;
    }
}