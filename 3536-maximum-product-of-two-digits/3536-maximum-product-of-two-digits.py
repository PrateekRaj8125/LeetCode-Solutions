class Solution:
    def maxProduct(self, n: int) -> int:
        dlist=[]
        while n>0:
            dlist.append(n%10)
            n//=10
        dlist.sort()
        if len(dlist)>0:
            return dlist[-1]*dlist[-2]
        else:
            return dlist[-1]