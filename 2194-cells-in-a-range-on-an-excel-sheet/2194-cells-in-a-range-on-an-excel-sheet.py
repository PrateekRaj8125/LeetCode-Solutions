class Solution:
    def cellsInRange(self, s: str) -> list[str]:
        s=s.split(":")
        start_col=s[0][0];end_col=s[1][0]
        start_row=int(s[0][1]);end_row=int(s[1][1])
        ans=[]
        for i in range(ord(start_col),ord(end_col)+1):
            for j in range(start_row,end_row+1):
                ans.append(chr(i)+str(j))
        return ans