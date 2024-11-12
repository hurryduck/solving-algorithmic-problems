# T 테스트 케이스
T = int(input())

result = ""
for _ in range(T):
    day_feed = int(input())
    distribution_total = sum(map(int, input().split()))
    
    date = 1
    while day_feed >= distribution_total:
        date += 1
        distribution_total *= 4

    result += str(date) + '\n'

print(result)
