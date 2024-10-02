n = int(input())

consecutiveCount = 0 # 연이은 수
for i in range(n):
    curSum = 0
    for j in range(i, n):
        curSum += j
        if curSum == n:
            consecutiveCount += 1
            break
        if curSum > n:
            break

print(consecutiveCount)