def get_mine_count(mine_matrix, col_index, row_index):
    directions = [
        (-1, -1), (-1, 0), (-1, 1),
        (0, -1),           (0, 1),
        (1, -1),  (1, 0),  (1, 1)
    ]

    mine_count = 0
    cols = len(mine_matrix)
    rows = len(mine_matrix[0])

    for d in directions:
        check_col = col_index + d[1]
        check_row = row_index + d[0]

        if 0 <= check_col < cols and 0 <= check_row < rows:
            if mine_matrix[check_col][check_row] == '*':
                mine_count += 1

    return mine_count

while True:
    col, row = map(int, input().split())

    if col == 0 and row == 0:
        break

    mine_matrix = []

    for _ in range(col):
        mine_matrix.append(list(input()))

    result_matrix = [col[:] for col in mine_matrix]

    for col_index in range(col):
        for row_index in range(row):
            if mine_matrix[col_index][row_index] == '.':
                mine_count = get_mine_count(mine_matrix, col_index, row_index)
                result_matrix[col_index][row_index] = str(mine_count)

    for row in result_matrix:
        print(''.join(row))
