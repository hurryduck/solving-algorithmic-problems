n = int(input())

deck = list(range(1, n + 1))

for _ in range(n):
    print(deck.pop(0))
    if deck.__len__() > 0:
        deck.append(deck[0])
        deck.pop(0)