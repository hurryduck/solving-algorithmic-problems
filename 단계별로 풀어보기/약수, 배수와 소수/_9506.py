# 약수들의 합
while True:
    n = (int)(input())
    if n == -1:
        break

    div_list = []
    div_sum = 0
    for div in range(1, n // 2 + 1):
        if (n % div == 0):
            div_list.append(div)
            div_sum += div

    if n == div_sum:
        print(f"{n} = {' + '.join(map(str, div_list))}")
    else:
        print(f"{n} is NOT perfect.")