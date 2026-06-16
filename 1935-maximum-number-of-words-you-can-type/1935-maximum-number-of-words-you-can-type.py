class Solution:
    def canBeTypedWords(self, text: str, brokenLetters: str) -> int:
        count = 0
        text = text.split()
        for i in range(len(text)):
            ans = True
            for j in range(len(text[i])):
                if text[i][j] in brokenLetters:
                    ans = False
                    break
            if ans == True:
                count += 1
        return count