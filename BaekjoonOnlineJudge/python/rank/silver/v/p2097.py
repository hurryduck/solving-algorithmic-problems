import math

n = int(input())

if n == 1:
        print(4)
else:
    sq_num = math.ceil(math.sqrt(n))

    if (sq_num - 1) * sq_num > n:
        print((sq_num - 2 + sq_num - 1) * 2)
    else:
        print((sq_num - 1) * 4)