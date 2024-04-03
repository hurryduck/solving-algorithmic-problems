# 분수찾기
input_num = int(input())
cycle_count = 0

while input_num > 0:
    cycle_count += 1
    input_num -= cycle_count

if cycle_count % 2 == 0:
    numerator = cycle_count + input_num
    denominator = 1 - input_num
else:
    numerator = 1 - input_num
    denominator = cycle_count + input_num

print(f"{numerator}/{denominator}")