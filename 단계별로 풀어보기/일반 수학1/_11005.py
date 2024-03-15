# 진법 변환
input_num, decimal_system = map(int, input().split())

num_tuple = ('0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z')

result_num = ""
while input_num >= decimal_system:
    quotient = input_num // decimal_system
    remainder = input_num % decimal_system
    result_num = num_tuple[remainder] + result_num
    input_num = quotient
    
result_num = num_tuple[input_num] + result_num
print(result_num)