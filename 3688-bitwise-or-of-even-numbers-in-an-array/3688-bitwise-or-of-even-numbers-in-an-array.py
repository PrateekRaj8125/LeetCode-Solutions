class Solution:
    def evenNumberBitwiseORs(self, nums: List[int]) -> int:
        soln=0
        for num in nums:
            if num%2==0:
                soln|=num
        return soln