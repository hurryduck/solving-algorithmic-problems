# 네 번째 점
dot1 = list(map(int, input().split()))
dot2 = list(map(int, input().split()))
dot3 = list(map(int, input().split()))

dots = [dot1, dot2, dot3]
dot4 = []

x_list = {}
y_list = {}

# 각 점의 x 좌표와 y 좌표를 카운트하여 딕셔너리에 저장
for dot in dots:
    x, y = dot
    x_list[x] = x_list.get(x, 0) + 1
    y_list[y] = y_list.get(y, 0) + 1

# 카운트가 1인 x 좌표와 y 좌표를 dot4 리스트에 추가
dot4 += [x for x, vlaue in x_list.items() if vlaue == 1]
dot4 += [y for y, vlaue in y_list.items() if vlaue == 1]
        
print(*dot4)