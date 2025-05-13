import sys
input = sys.stdin.readline

n, m = map(int, input().split())
graph = [list(input().strip()) for _ in range(n)]

visited = [[0] * m for _ in range(n)]  # 0: 미방문, 1: 방문 중, 2: 방문 완료
count = 0

dx = {'U': -1, 'D': 1, 'L': 0, 'R': 0}
dy = {'U': 0, 'D': 0, 'L': -1, 'R': 1}

def dfs(x, y):
    global count
    visited[x][y] = 1

    dir = graph[x][y]
    nx = x + dx[dir]
    ny = y + dy[dir]

    if visited[nx][ny] == 0:
        dfs(nx, ny)
    elif visited[nx][ny] == 1:
        count += 1

    visited[x][y] = 2

for i in range(n):
    for j in range(m):
        if visited[i][j] == 0:
            dfs(i, j)

print(count)
