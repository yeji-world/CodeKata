import sys
input = sys.stdin.read
data = input().split()

T = int(data[0])
test_cases = []
idx = 1
for _ in range(T):
    m = int(data[idx])
    n = int(data[idx+1])
    test_cases.append((m, n))
    idx += 2

MAX_M = 10
MAX_N = 2000
dp = [[0] * (MAX_N + 1) for _ in range(MAX_M + 1)]

for j in range(1, MAX_N + 1):
    dp[1][j] = 1

for i in range(2, MAX_M + 1):
    for j in range(1, MAX_N + 1):
        for k in range(1, j // 2 + 1):
            dp[i][j] += dp[i - 1][k]

for m, n in test_cases:
    result = sum(dp[m][j] for j in range(1, n + 1))
    print(result)
