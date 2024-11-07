# 팀의 수 N, 카약이 손상된 팀의 수 S, 카약을 하나 더 가져온 팀의 수 R
N, S, R = map(int, input().split())

team_kayak_num_list = [0] * N

# 손상된 팀을 -1로 표시
for damaged_team_num in map(int, input().split()):
    team_kayak_num_list[damaged_team_num - 1] = -1

# 여분의 카약이 있는 팀을 1로 표시
for reserved_team_num in map(int, input().split()):
    # 만약 여분의 카약이 있는 팀이 손상된 경우, 바로 0으로 초기화
    if team_kayak_num_list[reserved_team_num - 1] == -1:
        team_kayak_num_list[reserved_team_num - 1] = 0
    else:
        team_kayak_num_list[reserved_team_num - 1] = 1

# 여분의 카약을 인접 팀에 빌려주는 과정
for team_num in range(N):
    if team_kayak_num_list[team_num] == 1:
        # 왼쪽 팀에 빌려줄 수 있는 경우
        if team_num > 0 and team_kayak_num_list[team_num - 1] == -1:
            team_kayak_num_list[team_num - 1] = 0
            team_kayak_num_list[team_num] = 0
        # 오른쪽 팀에 빌려줄 수 있는 경우
        elif team_num < N - 1 and team_kayak_num_list[team_num + 1] == -1:
            team_kayak_num_list[team_num + 1] = 0
            team_kayak_num_list[team_num] = 0

# 손상된 팀 수 출력
print(team_kayak_num_list.count(-1))
