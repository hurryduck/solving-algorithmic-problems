def add_frame(frame, index, char):
    frame[0][index + 2] = char
    frame[1][index + 1] = char
    frame[1][index + 3] = char
    frame[2][index]     = char
    frame[2][index + 4] = char
    frame[3][index + 1] = char
    frame[3][index + 3] = char
    frame[4][index + 2] = char

WORD = input()

frame = [['.' for _ in range(4 * len(WORD) + 1)] for _ in range(5)]

# 알파벳 입력
for index in range(len(WORD)):
    frame[2][index * 4 + 2] = WORD[index]

# 피터팬 프레임 입력
for index in range(len(WORD)):
    add_frame(frame, index * 4, '#')

# 웬디 프레임 입력
for index in range(2, len(WORD), 3):
    add_frame(frame, index * 4, '*')

for row in frame:
    print("".join(row))