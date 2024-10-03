# 배수와 약수
while True:
    num1, num2 = map(int, input().split())
    # 0이 2개 주어질 경우 종료
    if (num1 == num2):
        break
    # 약수
    elif num2 % num1 == 0:
        print("factor")
    # 배수
    elif num1 % num2 == 0:
        print("multiple")
    # 약수 배수 둘다 아님
    else:
        print("neither")