# 크로아티아 알파벳

input_str = input()

croatia_tuple = ("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")

for croatia in croatia_tuple:
    input_str = input_str.replace(croatia, "*")

print(len(input_str))