class Solution {
    public int findKthPositive(int[] arr, int k) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // Calculate how many numbers are missing before arr[mid]
            int missing = arr[mid] - (mid + 1);
            
            if (missing < k) {
                left = mid + 1; // Look in the right half
            } else {
                right = mid - 1; // Look in the left half
            }
        }
        // At the end of the loop, left points to the correct position
        // The kth missing number is equal to left + k
        return left + k;
    }
}
