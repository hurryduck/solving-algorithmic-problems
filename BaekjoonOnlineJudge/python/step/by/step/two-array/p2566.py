# 최댓값
matrix = []
for _ in range(9):
    matrix.append(list(map(int, input().split())))

max_num = 0
max_index = [0, 0]
for row in range(9):
    for col in range(9):
        if (matrix[row][col] >= max_num):
            max_num = matrix[row][col]
            max_index[0], max_index[1] = row + 1, col + 1

print(max_num)
print(*max_index)