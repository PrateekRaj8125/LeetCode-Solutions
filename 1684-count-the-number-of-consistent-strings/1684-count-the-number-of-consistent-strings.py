class Solution:
    def countConsistentStrings(self, allowed: str, words: list[str]) -> int:
        ctr=0
        for word in words:
            flag=0
            for ch in word:
                if ch in allowed:
                    flag=1
                else:
                    flag=0
                    break
            if flag==1:
                ctr+=1
        return ctr