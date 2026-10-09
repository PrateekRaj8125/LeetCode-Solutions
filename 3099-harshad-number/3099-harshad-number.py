class Solution:
    def sumOfTheDigitsOfHarshadNumber(self, x: int) -> int:
        return sum(list(map(int,str(x)))) if x%sum(list(map(int,str(x))))==0 else -1