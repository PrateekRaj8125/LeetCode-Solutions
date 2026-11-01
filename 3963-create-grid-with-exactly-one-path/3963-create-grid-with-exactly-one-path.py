class Solution:
    def createGrid(self, m: int, n: int) -> list[str]:
        res=[['#']*n for _ in range(m)]
        row=col=0
        res[row][col]='.'
        while row<m-1 or col<n-1:
            if row<m-1 and (col==n-1 or abs((row+1)*(n-1)-col*(m-1)) <= abs(row*(n-1)-(col+1)*(m-1))):
                row+=1
            else:
                col+=1
            res[row][col]='.'
        return [''.join(row) for row in res]