import sys

input_str = sys.stdin.read().splitlines()

for test_case in input_str:
    input_arr             = list(map(int, test_case.split()))
    num_arr_len, *num_arr = input_arr

    if num_arr_len == 1:
        print("Jolly")
        continue

    diff_set = set()
    for num_index in range(1, num_arr_len):
        diff_set.add(abs(num_arr[num_index] - num_arr[num_index - 1]))

    is_jolly = diff_set == set(range(1, num_arr_len))

    if is_jolly:
        print("Jolly")
    else:
        print("Not jolly")
