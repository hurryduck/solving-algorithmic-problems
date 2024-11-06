# R 행, C 열 입력 받기
R, C = map(int, input().split())

team_scores = []
for _ in range(R):
    race_line = input()
    for i in range(1, len(race_line) - 3):
        if '.' != race_line[i]:
            team_number = int(race_line[i])
            score = i
            team_scores.append((team_number, score))
            break

sorted_scores = sorted(team_scores, key=lambda x: x[1], reverse=True)

team_ranks = []
current_rank = 0
previous_score = None

for i, (team_number, score) in enumerate(sorted_scores):
    if score != previous_score:
        current_rank += 1
        previous_score = score
    team_ranks.append((team_number, current_rank))

team_ranks.sort(key=lambda x: x[0])

for _, rank in team_ranks:
    print(rank)