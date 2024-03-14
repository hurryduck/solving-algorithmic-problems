# 행렬 덧셈

matrix_a = []
matrix_b = []

row, col = map(int, input().split())

for _ in range(row):
    matrix_a.append(list(map(int, input().split())))

for _ in range(row):
    matrix_b.append(list(map(int, input().split())))

for row_index in range(row):
    for col_index in range(col):
        matrix_a[row_index][col_index] += matrix_b[row_index][col_index]

for row_num in matrix_a:
    print(*row_num)