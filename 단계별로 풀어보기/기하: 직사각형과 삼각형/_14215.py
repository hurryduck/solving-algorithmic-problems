# 세 막대
import sys
input = sys.stdin.readline
side_list = list(map(int, input().split()))

max_side = max(side_list)
sum_except_max = sum(side_list) - max_side

if max_side >= sum_except_max:
    print(sum_except_max * 2 - 1)
else:
    print(sum_except_max + max_side)