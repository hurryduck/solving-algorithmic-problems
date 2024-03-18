# 벌집
input_num = (int)(input())
distance = 1
cur_range = 1

while cur_range < input_num:
    distance += 1
    cur_range += (distance - 1) * 6

print(distance)