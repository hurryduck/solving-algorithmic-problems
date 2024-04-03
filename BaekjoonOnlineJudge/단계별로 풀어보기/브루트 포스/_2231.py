# 분해합
import sys
input = sys.stdin.readline

# 입력 받기
N = int(input())

# 자릿수 구하기
digit_count = len(str(N))

# 시작값 설정
start = max(1, N - 9 * digit_count)

# N 이하의 가장 작은 분해합 구하기
for number in range(start, N):
    if number + sum(map(int, str(number))) == N:
        print(number)
        break
else:
    print(0)