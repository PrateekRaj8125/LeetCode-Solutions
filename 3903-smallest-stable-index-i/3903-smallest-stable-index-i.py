class Solution:
    def firstStableIndex(self, nums: list[int], k: int) -> int:
        for i in range(len(nums)):
            stability = max(nums[:i + 1]) - min(nums[i:])
            if stability <= k:
                return i
        return -1