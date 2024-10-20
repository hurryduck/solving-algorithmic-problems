row, col = map(int, input().split())
n = int(input())

row_cut = [0, col]  # 가로 방향 잘린 위치 (초기값: 0과 높이)
col_cut = [0, row]   # 세로 방향 잘린 위치 (초기값: 0과 너비)

for _ in range(n):
    direction, pos = map(int, input().split())
    if direction == 0:
        row_cut.append(pos)
    else:
        col_cut.append(pos)

row_cut.sort()
col_cut.sort()

max_row = max(row_cut[i] - row_cut[i-1] for i in range(1, len(row_cut)))
max_col = max(col_cut[i] - col_cut[i-1] for i in range(1, len(col_cut)))

print(max_row * max_col)