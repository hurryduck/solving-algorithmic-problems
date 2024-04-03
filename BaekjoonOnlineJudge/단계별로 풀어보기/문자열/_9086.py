# 문자열

repeat_num = int(input())

for _ in range(repeat_num):
    input_str = input()
    print(input_str[0] + input_str[-1])