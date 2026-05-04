class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        ans=0
        for character in stones:
            if character in jewels:
                ans+=1
        return ans