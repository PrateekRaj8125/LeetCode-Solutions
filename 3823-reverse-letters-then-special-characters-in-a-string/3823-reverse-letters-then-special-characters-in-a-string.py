class Solution:
    def reverseByType(self, s: str) -> str:
        chars:list[str] = list(s)
        letters, alphabets = [], []
        for i, l in enumerate(s):
            if l.isalpha():
                letters.append(i)
            else:
                alphabets.append(i)
        l, r = 0, len(letters) - 1
        while l < r:
            chars[letters[l]], chars[letters[r]] = chars[letters[r]], chars[letters[l]]
            l += 1
            r -= 1
        l, r = 0, len(alphabets) - 1
        while l < r:
            chars[alphabets[l]], chars[alphabets[r]] = chars[alphabets[r]], chars[alphabets[l]]
            l += 1
            r -= 1
        return "".join(chars)