class Solution:
    def digitFrequencyScore(self, n: int) -> int:
        score=0
        while n>0:
            d=n%10
            score+=d
            n//=10
        return score