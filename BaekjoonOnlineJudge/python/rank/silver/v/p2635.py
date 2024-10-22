def next_num(n1, n2, n_list):
    if n1 - n2 < 0:
        return len(n_list)
    else:
        n_list.append(n1 - n2)
        return next_num(n2, n1 - n2, n_list)

n1 = int(input())

max_length = 0
result_list = []

# n2의 범위를 수정하여 n1 // 2부터 n1까지 반복하도록 수정
for n2 in range(n1 // 2, n1 + 1):
    n_list = [n1, n2]
    current_length = next_num(n1, n2, n_list)
    
    if current_length > max_length:
        max_length = current_length
        result_list = n_list

print(max_length)
print(" ".join(map(str, result_list)))