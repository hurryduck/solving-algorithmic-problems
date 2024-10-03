from itertools import combinations

# 0!부터 19!까지의 팩토리얼 값
factorials = [1]
for i in range(1, 20):
    factorials.append(factorials[-1] * i)

sum_factorials = sum(factorials)  # 0!~19!까지의 합

n = int(input())

def is_factorial_sum_possible(n):
    if n > sum_factorials:  # sum_factorials보다 클 경우 조합으로 나올 수 없다.
        return "NO"

    # M이 1부터 20까지 조합 확인
    for m in range(1, 21):  # 1부터 20까지 반복
        for combo in combinations(range(20), m):
            _sum = sum(factorials[i] for i in combo)
            if n == _sum:
                return "YES"

    return "NO"

print(is_factorial_sum_possible(n))