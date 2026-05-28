class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        max_val=0
        for i in range(len(accounts)):
            max_val=max(max_val,sum(accounts[i]))
        return max_val