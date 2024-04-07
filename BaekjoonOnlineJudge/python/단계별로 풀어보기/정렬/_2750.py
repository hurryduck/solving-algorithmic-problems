# 수 정렬하기
import sys
input = sys.stdin.readline
N = int(input())

num_list = []
for _ in range(N):
    num_list.append(int(input()))

num_list = sorted(num_list)
for num in num_list:
    print(num)