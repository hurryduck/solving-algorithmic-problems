# 검증수
num_list = list(map(int, input().split()))
square_number = [0, 1, 4, 9, 6, 5, 6, 9, 4, 1]
total = 0
for num in num_list:
    total += square_number[num]
print(str(total)[-1])