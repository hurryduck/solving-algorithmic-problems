# 숫자의 합

num_repeat = int(input())
num_input = input()

num_total = 0
for i in range(num_repeat):
    num_total += int(num_input[i])

print(num_total)