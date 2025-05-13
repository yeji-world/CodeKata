import sys
input = sys.stdin.readline

def find(x):
    if x != parent[x]:
        parent[x] = find(parent[x])
    return parent[x]

def union(x, y):
    root_x = find(x)
    root_y = find(y)

    if root_x == root_y:        
        is_cycle[root_x] = True
    else:        
        parent[root_y] = root_x        
        if is_cycle[root_x] or is_cycle[root_y]:
            is_cycle[root_x] = True

case = 0

while True:
    n, m = map(int, input().split())
    if n == 0 and m == 0:
        break

    parent = [i for i in range(n + 1)]
    is_cycle = [False] * (n + 1)

    for _ in range(m):
        a, b = map(int, input().split())
        union(a, b)

    tree = set()
    for i in range(1, n + 1):
        root = find(i)
        if not is_cycle[root]:
            tree.add(root)

    case += 1

    if len(tree) == 0:
        print(f"Case {case}: No trees.")
    elif len(tree) == 1:
        print(f"Case {case}: There is one tree.")
    else:
        print(f"Case {case}: A forest of {len(tree)} trees.")