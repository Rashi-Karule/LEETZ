import java.util.ArrayList;
import java.util.List;

class Solution {
    // Mapping of digits to letters corresponding to telephone buttons
    private static final String[] KEYPAD = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        
        // Base case: return empty list if input is empty
        if (digits == null || digits.length() == 0) {
            return result;
        }
        
        // Start backtracking from index 0 with an empty combination string
        backtrack(result, digits, new StringBuilder(), 0);
        return result;
    }

    private void backtrack(List<String> result, String digits, StringBuilder current, int index) {
        // If the current combination is complete, add it to the results
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        // Get the letters corresponding to the current digit
        String letters = KEYPAD[digits.charAt(index) - '0'];

        // Loop through all possible letters for this digit
        for (int i = 0; i < letters.length(); i++) {
            current.append(letters.charAt(i));          // Choose
            backtrack(result, digits, current, index + 1); // Explore
            current.deleteCharAt(current.length() - 1);  // Unchoose (Backtrack)
        }
    }
}
