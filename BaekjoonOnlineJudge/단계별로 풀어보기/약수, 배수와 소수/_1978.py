# 소수 찾기
_ = input()
n_list = list(map(int, input().split()))

minority_count = 0
for n in n_list:
    is_minority = True
    # 약수 확인
    for div in range(2, n // 2 + 1):
        if (n % div == 0):
            is_minority = False
            break
    # 약수가 없다면 소수 개수 증가
    if (is_minority):
        minority_count += 1

# 소수에서 1은 제외
if 1 in n_list:
    minority_count -= 1

print(minority_count)