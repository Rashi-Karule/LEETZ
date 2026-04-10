class Solution(object):
    def moveZeroes(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        j = 0 #i pura array traverse karega
        # j → batata hai next non-zero kahan rakhna hai
        #Jab non-zero mile:
        #usko aage shift karo (swap)
        #j++
        for i in range(len(nums)):
            if nums[i] != 0:
                nums[j], nums[i] = nums[i], nums[j]
                j += 1
        