class Solution(object):
    def canJump(self, nums):
        maxReach = 0
        
        for i in range(len(nums)):
            if i > maxReach:
                return False   # yaha tak pahunch hi nahi sakte
            
            maxReach = max(maxReach, i + nums[i])
        
        return True