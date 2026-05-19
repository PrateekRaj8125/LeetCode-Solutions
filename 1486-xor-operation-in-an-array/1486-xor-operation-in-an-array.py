class Solution:
    def xorOperation(self, n: int, start: int) -> int:
        nums=[start]
        xor=nums[0]
        for i in range(1,n):
            nums.append(start+2*i)
            xor^=nums[i]
        return xor