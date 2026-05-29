class Solution:
    def minElement(self, nums: List[int]) -> int:
        ans=float('inf')
        for num in nums:
            sum=0
            while num:
                sum+=num%10
                num//=10
            ans=min(sum,ans)
        return ans