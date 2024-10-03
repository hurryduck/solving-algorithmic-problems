# ACM 호텔
T = int(input())
for _ in range(T):
    H, W, N = map(int, input().split())
    if N % H == 0:
        YY = H
        XX = "{:02}".format(N // H)
    else:
        YY = N % H
        XX = "{:02}".format(N // H + 1)
    print(str(YY) + XX)