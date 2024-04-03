# 영수증

# 구현
input_total_price = int(input())
input_list_len = int(input())
input_receipt= list()
for i in range(input_list_len):
    input_receipt.append(list(map(int, input().split())))

total_price = 0
for item in input_receipt:
    total_price += item[0] * item[1]

print("Yes" if input_total_price == total_price else "No")