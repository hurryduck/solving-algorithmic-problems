import sys

U, N = map(int, sys.stdin.readline().split())

auction_price_list = [N + 1] * U
auction_bidders = {}

for _ in range(N):
    S, P = sys.stdin.readline().split()
    P = int(P)

    if auction_price_list[P - 1] == N + 1:
        auction_price_list[P - 1] = 1
    else:    
        auction_price_list[P - 1] += 1

    if P not in auction_bidders:
        auction_bidders[P] = S

min_price = auction_price_list.index(min(auction_price_list)) + 1
print(auction_bidders[min_price] + " " + str(min_price))