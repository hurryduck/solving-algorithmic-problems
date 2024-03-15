# 진법 변환
input_num, decimal_system = input().split()

num_tuple = ('0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z')

result_num = 0
for num in input_num:
    result_num = result_num * (int)(decimal_system) + num_tuple.index(num)

print(result_num)