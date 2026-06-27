class Solution:
    def reverseDegree(self, s: str) -> int:
        ans=0;i=1
        s.lower()
        for ch in s:
            ans+=(26-(ord(ch)-97))*i
            i+=1
        return ans