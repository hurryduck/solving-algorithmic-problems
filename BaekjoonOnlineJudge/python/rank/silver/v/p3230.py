player_count, cutline = map(int, input().split())

first_game = []
for _ in range(player_count):
    rank = int(input()) - 1
    first_game.insert(rank, len(first_game) + 1)

survive_players = first_game[:cutline]
reversed_survive_players = list(reversed(survive_players))

second_game = []
for _ in range(cutline):
    rank = int(input()) - 1
    second_game.insert(rank, reversed_survive_players.pop(0))

for rank in range(3):
    print(second_game[rank])
