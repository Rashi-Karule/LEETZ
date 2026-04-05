class Solution(object):
    def containsNearbyAlmostDuplicate(self, nums, indexDiff, valueDiff):
        if valueDiff < 0:
            return False
        
        bucket = {}
        size = valueDiff + 1
        
        for i in range(len(nums)):
            num = nums[i]
            bucket_id = num // size
            
            # same bucket
            if bucket_id in bucket:
                return True
            
            # neighbor buckets
            if (bucket_id - 1 in bucket and 
                abs(num - bucket[bucket_id - 1]) <= valueDiff):
                return True
            
            if (bucket_id + 1 in bucket and 
                abs(num - bucket[bucket_id + 1]) <= valueDiff):
                return True
            
            # insert into bucket
            bucket[bucket_id] = num
            
            # maintain window size
            if i >= indexDiff:
                old_bucket_id = nums[i - indexDiff] // size
                del bucket[old_bucket_id]
        
        return False