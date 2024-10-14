from math import ceil
S = int(input())

count = 0
for a in range(ceil(S / 3), ceil(S / 2)):  # 첫 번째 변
    for b in range(ceil((S - a) / 2), a + 1):  # 두 번째 변
            count += 1

print(count)