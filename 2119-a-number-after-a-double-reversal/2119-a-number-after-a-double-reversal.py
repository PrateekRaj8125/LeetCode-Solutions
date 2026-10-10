class Solution:
    def isSameAfterReversals(self, num: int) -> bool:
        return True if num==int("".join(reversed(str(int("".join(reversed(str(num)))))))) else False