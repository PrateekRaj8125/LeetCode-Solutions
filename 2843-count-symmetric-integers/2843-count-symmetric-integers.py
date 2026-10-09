class Solution:
    def countSymmetricIntegers(self, low: int, high: int) -> int:
        ctr=0
        for num in range(low,high+1):
            n=len(str(num))
            if n%2==0:
                l=list(map(int,str(num)))
                if sum(l[:n//2])==sum(l[n//2:]):
                    ctr+=1
        return ctr