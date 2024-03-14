# 색종이
matrix = [[0] * 100 for _ in range(100)]

input_count = int(input())

for _ in range(input_count):
    row, col = map(int, input().split())
    for i in range(row, row + 10):
        for j in range(col, col + 10):
            matrix[i][j] = 1

total = sum(sum(row) for row in matrix)

print(total)