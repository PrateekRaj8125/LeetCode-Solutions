class Solution:
    def countSeniors(self, details: List[str]) -> int:
        return sum(1 for person in details if int(person[11:13])>60)