class Solution(object):
    def diagonalSum(self, mat):
        n = len(mat)
        total = 0
        
        for i in range(n):
            total += mat[i][i]              # primary diagonal
            total += mat[i][n-i-1]          # secondary diagonal
        
        # agar n odd hai toh center element minus karo
        if n % 2 == 1:
            total -= mat[n//2][n//2]
        
        return total