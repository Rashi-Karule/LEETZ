class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        
        // 1. Pehla position dhoondhne ke liye search
        ans[0] = findFirst(nums, target);
        
        // 2. Aakhri position dhoondhne ke liye search
        ans[1] = findLast(nums, target);
        
        return ans;
    }

    // Aapka binary search method - pehla index dhoondhne ke liye
    public int findFirst(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int index = -1; // Agar nahi mila toh -1 return hoga

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                index = mid;       // Element mila, index save karo
                right = mid - 1;   // Lekin pehla occurrence chahiye, isliye LEFT me aur dhoondho
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return index;
    }

    // Aapka binary search method - aakhri index dhoondhne ke liye
    public int findLast(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int index = -1; 

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                index = mid;       // Element mila, index save karo
                left = mid + 1;    // Lekin aakhri occurrence chahiye, isliye RIGHT me aur dhoondho
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return index;
    }
}
