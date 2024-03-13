# 공 바꾸기

num_baskets, num_swaps = map(int, input().split())
baskets = list(range(1, num_baskets + 1))

for _ in range(num_swaps):
    i, j = map(int, input().split())
    baskets[i - 1], baskets[j - 1] = baskets[j - 1], baskets[i - 1]

print(" ".join(map(str, baskets)))