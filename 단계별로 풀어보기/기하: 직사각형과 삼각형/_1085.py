# 직사격형에서 탈출
x, y, w, h = map(int, input().split())

distance_list = [x, y, w - x, h - y]

print(min(distance_list))