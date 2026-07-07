class Solution:
    def sumAndMultiply(self, n: int) -> int:
        if n == 0:
            return 0
        x = ""
        digit_sum = 0
        while n > 0:
            digit = n % 10
            if digit != 0:
                digit_sum += digit
                x += str(digit)
            n //= 10
        x = x[::-1]
        return int(x) * digit_sum