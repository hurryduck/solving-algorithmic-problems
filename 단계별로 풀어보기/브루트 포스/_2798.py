# 블랙잭
import sys
input = sys.stdin.readline
_, M = map(int, input().split())
nums = tuple(map(int, input().split()))

sum_list = []
for i in range(0, len(nums) - 2):
    for j in range(i + 1, len(nums) - 1):
        for k in range(j + 1, len(nums)):
            if (nums[i] + nums[j] + nums[k] <= M):
                sum_list.append(nums[i] + nums[j] + nums[k])

print(max(sum_list))