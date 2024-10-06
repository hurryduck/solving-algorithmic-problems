N, M = map(int, input().split())

# 원래 배열 입력 받기
matrix = []
for _ in range(N):
    matrix.append(list(map(int, input().split())))

# 2차원 누적합 배열 초기화 (0으로 초기화된 배열)
prefix_sum = [[0] * (M + 1) for _ in range(N + 1)]

# 누적합 계산
for i in range(1, N + 1):
    for j in range(1, M + 1):
        prefix_sum[i][j] = matrix[i - 1][j - 1] + prefix_sum[i - 1][j] + prefix_sum[i][j - 1] - prefix_sum[i - 1][j - 1]

# 쿼리 처리
K = int(input())
for _ in range(K):
    i, j, x, y = map(int, input().split())
    
    # 누적합을 사용해 (i, j)에서 (x, y) 구간 합 계산
    result = (prefix_sum[x][y]
              - prefix_sum[x][j - 1]
              - prefix_sum[i - 1][y]
              + prefix_sum[i - 1][j - 1])
    
    print(result)