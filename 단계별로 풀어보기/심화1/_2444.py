# 별 찍기 - 7

input_num = (int)(input())

for i in range(input_num):
    line = ""
    for j in range(input_num - 1, -1, -1):
        if (j > i):
            line += " "
        else:
            line += "*"
    for j in range(input_num):
        if (j < i):
            line += "*"
    print(line)

for i in range(input_num - 1):
    line = ""
    for j in range(input_num):
        if (j > i):
            line += "*"
        else:
            line += " "
    for j in range(input_num - 2, -1, -1):
        if (j > i):
            line += "*"
    print(line)