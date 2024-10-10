import sys

t = int(sys.stdin.readline())

for _ in range(t):
    sys.stdin.readline()
    r, c = map(int, sys.stdin.readline().split())
    box = [sys.stdin.readline().strip() for _ in range(r)]

    candy_count = 0
    
    # 가로 유형 탐색
    for y in range(r):
        for x in range(0, c - 2 if c - 2 > 0 else c):  # 가로로 3칸을 차지하는 범위 탐색
            if box[y][x] == ">" and box[y][x + 1] == "o" and box[y][x + 2] == "<":
                candy_count += 1

    # 세로 유형 탐색
    for y in range(0, r - 2 if r - 2 > 0 else r):  # 세로로 3칸을 차지하는 범위 탐색
        for x in range(c):
            if box[y][x] == "v" and box[y + 1][x] == "o" and box[y + 2][x] == "^":
                candy_count += 1

    print(candy_count)