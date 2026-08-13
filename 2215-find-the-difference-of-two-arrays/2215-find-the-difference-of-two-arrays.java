class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            if (!contains(nums2, nums1[i]) && !list1.contains(nums1[i])) {
                list1.add(nums1[i]);
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            if (!contains(nums1, nums2[i]) && !list2.contains(nums2[i])) {
                list2.add(nums2[i]);
            }
        }

        ans.add(list1);
        ans.add(list2);

        return ans;
    }

    public boolean contains(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }
}