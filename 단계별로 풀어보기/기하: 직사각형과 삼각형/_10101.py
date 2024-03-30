# 삼각형 외우기
import sys
input = sys.stdin.readline
angle_list = []
for _ in range(3):
    angle_list.append(int(input()))

if sum(angle_list) != 180:
    print("Error")
elif angle_list.count(angle_list[0]) == 3:
    print("Equilateral")
elif angle_list.count(angle_list[0]) == 2 or angle_list.count(angle_list[1]) == 2:
    print("Isosceles")
else:
    print("Scalene")