class Solution:
    def checkIfPangram(self, sentence: str) -> bool:
        alpha=set("abcdefghijklmnopqrstuvwxyz")
        data=set(sentence)
        return alpha<=data