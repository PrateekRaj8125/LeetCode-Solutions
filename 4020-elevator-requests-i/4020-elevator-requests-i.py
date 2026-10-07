class Solution:
    def elevatorRequests(self, n: int, requests: list[int]) -> int:
        floor=0;total_time=0
        for request in requests:
            total_time+=abs(request-floor)
            floor=request
        return total_time