# 문자열 반복

input_repeat_count = int(input())

for _ in range(input_repeat_count):
    repeat_count, input_str = input().split()
    result_str = ""
    for char in input_str:
        result_str += char * int(repeat_count)
    print(result_str)