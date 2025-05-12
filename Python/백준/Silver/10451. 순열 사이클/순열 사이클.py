t = int(input())
for _ in range(t):
    n = int(input())
    data = list(map(int, input().split()))
    permutation = [0] + data

    visited = [False] * (n + 1)
    count = 0

    for i in range(1, n + 1):
        if not visited[i]:
            idx = i
            while not visited[idx]:
                visited[idx] = True
                idx = permutation[idx]
            count += 1

    print(count)
                    