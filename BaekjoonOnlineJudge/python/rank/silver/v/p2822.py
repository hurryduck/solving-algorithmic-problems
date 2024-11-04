score_list = []

for problem_num in range(8):
    score_list.append((int(input()), problem_num + 1))

sorted_data = sorted(score_list, key=lambda x: x[0], reverse=True)

total_score = sum(x[0] for x in sorted_data[:5])
problem_num_list = sorted(list(x[1] for x in sorted_data[:5]))

print(total_score)
print(" ".join(str(num) for num in problem_num_list))