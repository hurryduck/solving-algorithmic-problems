# 코딩은 체육과목 입니다

# 구현
input_byte = int(input())

result_type = list()
for str in range(0, input_byte, 4):
    result_type.append("long")

print(" ".join(result_type) + " int")