# 상수

input_num1, input_num2 = input().split()
input_num1 = int(input_num1[::-1])
input_num2 = int(input_num2[::-1])
print(input_num1 if input_num1 > input_num2 else input_num2)