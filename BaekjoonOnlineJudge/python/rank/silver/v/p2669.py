space_set = set()

for _ in range(4):
    x1, y1, x2, y2 = map(int, input().split())
    for x in range(x1, x2):
        for y in range(y1, y2):
            space_set.add((x, y))

print(len(space_set))