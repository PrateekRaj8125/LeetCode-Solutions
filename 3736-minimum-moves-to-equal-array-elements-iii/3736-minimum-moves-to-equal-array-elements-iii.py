class Solution:
    def minMoves(self, nums: List[int]) -> int:
        limit=max(nums)
        return sum(limit-num for num in nums)