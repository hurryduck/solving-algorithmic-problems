from itertools import combinations

# 0!부터 19!까지의 팩토리얼 값
factorials = [
    1,                   # 0!
    1,                   # 1!
    2,                   # 2!
    6,                   # 3!
    24,                  # 4!
    120,                 # 5!
    720,                 # 6!
    5040,                # 7!
    40320,               # 8!
    362880,              # 9!
    3628800,             # 10!
    39916800,            # 11!
    479001600,           # 12!
    6227020800,          # 13!
    87178291200,         # 14!
    1307674368000,       # 15!
    20922789888000,      # 16!
    355687428096000,     # 17!
    6402373705728000,    # 18!
    121645100408832000   # 19!
]
sum_factorials = 128425485935180314  # 0!~19!까지의 합

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
            elif n < _sum:
                break

    return "NO"

print(is_factorial_sum_possible(n))