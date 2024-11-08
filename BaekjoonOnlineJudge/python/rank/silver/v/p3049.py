def count_intersection_points(N):
    if N < 4:
        return 0  # 4개의 점이 있어야 교차점을 만들 수 있음
    return (N * (N - 1) * (N - 2) * (N - 3)) // 24

# 입력 처리
N = int(input())
print(count_intersection_points(N))