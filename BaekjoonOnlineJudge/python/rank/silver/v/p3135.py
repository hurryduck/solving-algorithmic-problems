cur_frequency, target_frequency = map(int, input().split())
bookmark_count = int(input())

closest_frequency_distance = abs(cur_frequency - target_frequency)

for _ in range(bookmark_count):
    bookmark = int(input())

    bookmark_distance = abs(bookmark - target_frequency)

    if bookmark_distance < closest_frequency_distance:
        closest_frequency_distance = bookmark_distance + 1

print(closest_frequency_distance)