class Solution {
    public void moveZeroes(int[] nums) {

        int index = 0;
        // Saare non-zero elements aage laao
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        // Bachi hui positions mein 0 bhar do
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}