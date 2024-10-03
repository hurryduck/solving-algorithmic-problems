# 삼각형과 세변
import sys

while True:
    side_list = list(map(int, input().split()))

    if sum(side_list) == 0:
        break

    if sum(side_list) - (max(side_list) * 2) <= 0:
        print("Invalid")
    elif side_list.count(side_list[0]) == 3:
        print("Equilateral")
    elif side_list.count(side_list[0]) == 2 or side_list.count(side_list[1]) == 2:
        print("Isosceles")
    else:
        print("Scalene")
