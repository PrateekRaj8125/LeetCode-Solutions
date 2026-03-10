class Solution:
    def convertToBase7(self, num: int) -> str:
        if num==0:
            return "0"
        negative=num<0
        num=abs(num)
        res=""
        while num>0:
            res+=str(num%7)
            num//=7
        if negative:
            return "-"+res[::-1]
        return res[::-1]