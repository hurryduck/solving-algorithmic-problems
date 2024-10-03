n = int(input())

consecutive_count = 1 # 연이은 수, 자기자신 포함
start = 1
end = 1
sum = 1

while (start <= n // 2 + 1):
    if sum < n:
        end += 1
        sum += end 
    else:
        if sum == n and not (n == 1 or n == 2):
            consecutive_count += 1
        sum -= start
        start += 1


print(consecutive_count)