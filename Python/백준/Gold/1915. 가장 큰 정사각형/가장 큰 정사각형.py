n, m = map(int, input().split())
matrix = [list(input()) for _ in range(n)]

dp = [[0] * m for _ in range(n)]
max_size = 0

for i in range(n):
    for j in range(m):
        if matrix[i][j] == '1':
            if i == 0 or j == 0:
                dp[i][j] = 1
            else:
                dp[i][j] = min(
                    dp[i-1][j],
                    dp[i][j-1],
                    dp[i-1][j-1]
                ) + 1
            max_size = max(max_size, dp[i][j])

print(max_size * max_size)
