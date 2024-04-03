# 알파벳 찾기

str_input = input()

result_list = []
for alphabet in range(97, 123):
    if chr(alphabet) in str_input:
        result_list.append(str_input.index(chr(alphabet)))
    else:
        result_list.append(-1)
        
print(" ".join(map(str, result_list)))