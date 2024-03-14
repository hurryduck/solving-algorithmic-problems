# 팰린드롬인지 확인하기

input_str = input()
if (input_str == input_str[::-1]):
    print(1)
else:
    print(0)