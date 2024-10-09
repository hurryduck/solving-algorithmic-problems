import sys
from itertools import combinations

N = int(sys.stdin.readline()) # 플레이어 수 N

winner_num = 0
winner = 0
for player in range(N):
    card_list = tuple(map(int, sys.stdin.readline().split())) # 카드 5장 입력

    player_num = 0 # 해당 플레이어의 최대 한 자리 수를 저장하는 변수
    # 카드 5장 중 3장을 고르는 모든 조합 중 1의 자리가 가장 큰 수 계산
    for combo in combinations(card_list, 3):
        one_digit_num = sum(combo) % 10
        if player_num <= one_digit_num:
            player_num = one_digit_num
        
    if winner_num <= player_num:
        winner_num = player_num
        winner = player

print(winner + 1)