# 약수 구하기
num, index = map(int, input().split())

div_list = []
for div in range(1, num + 1):
    # 약수 확인
    if (num % div == 0):
        # 약수 리스트 추가
        div_list.append(div)
# index 크기 확인
if len(div_list) < index:
    print(0)
else:
    print(div_list[index - 1])