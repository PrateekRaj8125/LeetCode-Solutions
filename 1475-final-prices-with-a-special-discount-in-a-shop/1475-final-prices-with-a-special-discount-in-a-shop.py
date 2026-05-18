class Solution:
    def finalPrices(self, prices: List[int]) -> List[int]:
        answer=prices.copy()
        for i in range(len(prices)):
            for j in range(i+1,len(prices)):
                if answer[j]<=answer[i]:
                    answer[i]-=answer[j]
                    break
        return answer