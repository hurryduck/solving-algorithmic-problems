# 소수
M = int(input())
N = int(input())
if M == 1:
    M = 2

total_minority = 0
min_minority = 0
for num in range(N, M - 1, -1):
    is_minority = True
    for div in range(2, num // 2 + 1):
        if (num % div == 0):
            is_minority = False
            break
    if (is_minority):
        min_minority = num
        total_minority += num

if (min_minority != 0):
    print(total_minority)
    print(min_minority)
else:
    print(-1)