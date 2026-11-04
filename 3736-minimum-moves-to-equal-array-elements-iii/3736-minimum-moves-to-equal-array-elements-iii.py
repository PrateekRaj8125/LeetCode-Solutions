class Solution:
    def minMoves(self, nums: List[int]) -> int:
        upper_bound=max(nums)
        ans=0
        for num in nums:
            ans+=upper_bound-num
        return ans