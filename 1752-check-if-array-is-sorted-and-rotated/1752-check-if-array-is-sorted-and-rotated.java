class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        
        // Count pairs where the current element is greater than the next
        for (int i = 0; i < n; i++) {
            // Use modulo to wrap around to the beginning for the last comparison
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }
        
        // A sorted and rotated array has at most one "drop"
        return count <= 1;
    }
}
