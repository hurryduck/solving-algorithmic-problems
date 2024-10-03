# 설탱배달
N = int(input())

bag_num = 0
while N >= 0:
    if N % 5 == 0:
        bag_num += N // 5
        print(bag_num)
        break
    else:
        N -= 3
        bag_num += 1
else:
    print(-1)
