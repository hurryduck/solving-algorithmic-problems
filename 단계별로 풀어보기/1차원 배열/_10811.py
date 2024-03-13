# 바구니 뒤집기

num_baskets, num_swaps = map(int, input().split())
baskets = list(range(1, num_baskets + 1))

for _ in range(num_swaps):
    i, j = map(int, input().split())
    baskets[i - 1:j] = reversed(baskets[i - 1:j])

print(" ".join(map(str, baskets)))