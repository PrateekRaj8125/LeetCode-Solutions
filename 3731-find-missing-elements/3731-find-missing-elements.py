class Solution:
    def findMissingElements(self, nums: List[int]) -> List[int]:
        nums.sort()
        ans=[]
        for num in range(nums[0],nums[-1]+1):
            if num not in nums:
                ans.append(num)
        return ans