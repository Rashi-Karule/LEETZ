class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int left = 0;
        int right = height.length - 1;
        
        while (left < right) {
            // Calculate the width between the current pointers
            int width = right - left;
            
            // Calculate the current area based on the limiting shorter height
            int currentArea = Math.min(height[left], height[right]) * width;
            
            // Keep track of the maximum water found so far
            maxWater = Math.max(maxWater, currentArea);
            
            // Move the pointer pointing to the shorter line inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return maxWater;
    }
}