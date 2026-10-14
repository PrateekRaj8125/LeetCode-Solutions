class Solution:
    def kthDistinct(self, arr: list[str], k: int) -> str:
        freq=Counter(arr)
        for item in arr:
            if freq[item]==1:
                k-=1
                if k==0:
                    return item
        return ""