# 소인수분해
N = (int)(input())

sqrt_n = int(N ** 0.5)
div = 2

while div <= sqrt_n:
    if N % div == 0:
        print(div)
        N //= div
    else:
        div += 1

if N > 1:
    print(N)