N, M = map(int, input().split())
MATRIX_A = []
for _ in range(N):
    MATRIX_A.append(tuple(map(int, input().split())))

M, K = map(int, input().split())
MATRIX_B = []
for _ in range(M):
    MATRIX_B.append(tuple(map(int, input().split())))

MATRIX_C = [[0 for _ in range(K)] for _ in range(N)]
for n in range(N):
    for k in range(K):
        for m in range(M):
            MATRIX_C[n][k] += MATRIX_A[n][m] * MATRIX_B[m][k]

for row in MATRIX_C:
    print(" ".join(map(str, row)))