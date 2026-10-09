class Solution:
    def isAcronym(self, words: List[str], s: str) -> bool:
        test=""
        for i in range(len(words)):
            test+=words[i][0]
        return True if test==s else False