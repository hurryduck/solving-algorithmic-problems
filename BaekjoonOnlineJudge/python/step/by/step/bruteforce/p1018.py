# 체스판 다시 칠하기
M, N = map(int, input().split())
chess_board = []
for _ in range(M):
    chess_board.append(input())

pattern_black = ['BWBWBWBW', 'WBWBWBWB'] * 4
pattern_white = ['WBWBWBWB', 'BWBWBWBW'] * 4

count_list = []

for start_i in range(M - 7):
    for start_j in range(N - 7):
        paint_count_black = 0
        paint_count_white = 0
        for i in range(8):
            for j in range(8):
                if chess_board[start_i + i][start_j + j] != pattern_black[i][j]:
                    paint_count_black += 1
                if chess_board[start_i + i][start_j + j] != pattern_white[i][j]:
                    paint_count_white += 1
        count_list.append(min(paint_count_black, paint_count_white))

print(min(count_list))