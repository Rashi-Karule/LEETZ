import java.util.HashSet;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> window = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            // Remove elements that are out of the sliding window range
            if (i > k) {
                window.remove(nums[i - k - 1]);
            }
            
            // If the element is already in the set, a duplicate exists within distance k
            if (!window.add(nums[i])) {
                return true;
            }
        }
        
        return false;
    }
}
