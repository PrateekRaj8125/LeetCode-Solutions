class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        for i,j in enumerate(nums):
            if i!=0:
                nums[i]+=nums[i-1]
        return nums        