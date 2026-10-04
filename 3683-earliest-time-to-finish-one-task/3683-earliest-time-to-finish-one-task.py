class Solution:
    def earliestTime(self, tasks: List[List[int]]) -> int:
        task=[]
        for i in range(len(tasks)):
            task.append(sum(tasks[i]))
        return min(task)