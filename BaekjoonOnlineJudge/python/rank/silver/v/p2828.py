# N 스크린 크기
# M 바구니 크기
N, M = map(int, input().split())

# 사과 개수
J = int(input())

basket_pos = 1
move_distance = 0
for _ in range(J):
    apple_pos = int(input())
    
    if apple_pos < basket_pos:
        move_distance += basket_pos - apple_pos
        basket_pos = apple_pos
    elif apple_pos > basket_pos + M - 1:
        move_distance += apple_pos - basket_pos - M + 1
        basket_pos = apple_pos - M + 1

print(move_distance)