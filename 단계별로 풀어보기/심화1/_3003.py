# 킹, 퀸, 룩, 비숍, 나이트, 폰

chess_piece_nums = (1, 1, 2, 2, 2, 8)

find_piece_nums = list(map(int, input().split()))

necessary_piece_nums = []
for i in range(6):
    necessary_piece_nums.append(chess_piece_nums[i] - find_piece_nums[i])

print(" ".join(map(str, necessary_piece_nums)))