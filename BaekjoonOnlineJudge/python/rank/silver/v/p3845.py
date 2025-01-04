WIDTH = 100
HEIGHT = 75

def can_cover(positions, max_distance, end_pos):
    if positions[0] > max_distance / 2:
        return False

    if (end_pos - positions[-1]) > max_distance / 2:
        return False

    for i in range(1, len(positions)):
        if positions[i] - positions[i - 1] > max_distance:
            return False

    return True

while True:
    row_count, col_count, machine_width = map(float, input().split())

    if row_count == 0 and col_count == 0 and machine_width == 0:
        break

    row_positions = list(map(float, input().split()))
    col_positions = list(map(float, input().split()))

    row_positions.sort()
    col_positions.sort()

    if (
        can_cover(row_positions, machine_width, HEIGHT)
and can_cover(col_positions, machine_width, WIDTH)
    ):
        print("YES")
    else:
        print("NO")
