# 대소문자 바꾸기
s = input()

new_s = ""
for char in s:
    if char.isupper():
        new_s += char.lower()
    else:
        new_s += char.upper()

print(new_s)