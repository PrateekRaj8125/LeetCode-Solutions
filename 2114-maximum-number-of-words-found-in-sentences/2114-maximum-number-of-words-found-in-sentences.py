class Solution:
    def mostWordsFound(self, sentences: List[str]) -> int:
        ans=0
        for i in range(len(sentences)):
            ans=max(ans,len(sentences[i].split()))
        return ans