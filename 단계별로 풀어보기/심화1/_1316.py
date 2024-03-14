# 그룹 단어 체커

input_count = (int)(input())

group_count = 0
for _ in range(input_count):
    input_str = input()
    alphabet_list = [input_str[0]]
    is_group = True
    for alphabet in input_str:
        if (alphabet != alphabet_list[-1]):
            if (alphabet in alphabet_list):
                is_group = False
                break
            else:
                alphabet_list.append(alphabet)
    if (is_group):
        group_count += 1

print(group_count)
