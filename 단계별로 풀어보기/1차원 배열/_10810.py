# 공 넣기

input_basket_and_times = list(map(int, input().split()))
baskets = [0] * input_basket_and_times[0]

for i in range(input_basket_and_times[1]):
    input_balls = list(map(int, input().split()))
    for basket_index in range(input_balls[0] - 1, input_balls[1]):
        baskets[basket_index] = input_balls[2]

print(" ".join(map(str, baskets)))