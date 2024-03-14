# 세로읽기
matrix = []
for _ in range(5):
    matrix.append(input())

vertical_reading = [""] * 15
for row in range(5):
    for index, word in enumerate(matrix[row]):
        vertical_reading[index] += word

print("".join(vertical_reading))