class Solution:
    def countDigits(self, num: int) -> int:
        count=0;dn=num
        while num>0:
            d=num%10
            if dn%d==0:
                count+=1
            num//=10
        return count