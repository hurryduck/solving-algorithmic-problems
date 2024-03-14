# 단어 공부

input_str = input()

input_str = input_str.lower()
used_list = [0 for _ in range(26)]

for alphabet in input_str:
    used_list[ord(alphabet) - ord('a')] += 1

max_used = max(used_list)
if (used_list.count(max_used) == 1):
    print(chr(used_list.index(max_used) + ord('A')))
else:
    print("?")