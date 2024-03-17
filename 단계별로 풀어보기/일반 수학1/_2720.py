# 세탁소 사장 동혁
input_count = (int)(input())
coin_tuple = (25, 10, 5, 1)

for _ in range(input_count):
    change_list = [0, 0, 0, 0]
    change = (int)(input())
    
    for i in range(len(coin_tuple)):
        change_list[i] = change // coin_tuple[i]
        change %= coin_tuple[i]

    print(*change_list)