# 개수 세기

input_num = int(input())
input_num_list = list(map(int, input().split()))
input_count_num = int(input())
count = 0

for num in input_num_list:
    if (num == input_count_num):
        count += 1

print(count)