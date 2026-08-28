class Solution:
    def differenceOfSum(self, nums: List[int]) -> int:
        digitsum=sum(map(int,''.join(map(str,nums))))
        return abs(sum(nums)-digitsum)