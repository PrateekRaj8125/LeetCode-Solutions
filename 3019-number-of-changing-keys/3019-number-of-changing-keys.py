class Solution:
    def countKeyChanges(self, s: str) -> int:
        s=s.lower()
        key=s[0]
        counter=0
        for i in range(1,len(s)):
            if s[i]!=key:
                counter+=1
                key=s[i]
        return counter