#알고리즘 수업 - 점근적 표기 1
a_1, a_0 = map(int, input().split())
c = int(input())
n_0 = int(input())
if c >= a_1:
    if (a_1 * n_0) + a_0 <= c * n_0:
        print(1)
    else:
        print(0)
else:
    print(0)