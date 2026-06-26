class Solution:
    def search(self, nums: List[int], target: int) -> int:
        l, r = 0, len(nums) - 1
        # binary search only works on sorted array 
        while l <= r: 
            mid = (l + r) // 2
            # find middle index, if middle is too big target is in 
            # left half so shrink right boundary and focus on left
            if nums[mid] > target: 
                r = mid - 1
            elif nums[mid] < target:
                l = mid + 1
            # keep shrinking left and right side until target found
            else:
                return mid 
        return -1
        