class Solution:
    def maximumNumberOfStringPairs(self, words: List[str]) -> int:
        hashset = set()
        count = 0
        wordset = set(words)
        for i in range(len(words)):
            rev = words[i][::-1]
            if rev!=words[i] and words[i] not in hashset and rev in wordset:
                count+=1
                hashset.add(words[i])
                hashset.add(rev)
        return count