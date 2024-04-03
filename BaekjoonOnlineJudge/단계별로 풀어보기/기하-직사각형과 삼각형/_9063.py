# 대지
N = int(input())

if N == 1:
    print(0)
else:
    max_x, max_y = -100_001, -100_001
    min_x, min_y = 100_001, 100_001

    for _ in range(N):
        x, y = map(int, input().split())
        max_x = max(x, max_x)
        max_y = max(y, max_y)
        min_x = min(x, min_x)
        min_y = min(y, min_y)

    print((max_x - min_x) * (max_y - min_y))
