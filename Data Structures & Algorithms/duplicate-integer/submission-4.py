class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        # hash sets cannot contain duplicates, so we use this
        exists = set()

        for x in nums: 
            # if x is already in set, the val appears more than once
            if x in exists: 
                return True; 
            # otherwise add the value to the set
            exists.add(x)
        return False; 
        