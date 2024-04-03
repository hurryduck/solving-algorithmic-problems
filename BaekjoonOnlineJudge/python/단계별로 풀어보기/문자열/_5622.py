# 다이얼

input_str = input()

dial_tuple = (("A", "B", "C"), ("D", "E", "F"), ("G", "H", "I"), ("J", "K", "L"), ("M", "N", "O"), ("P", "Q", "R", "S"), ("T", "U", "V"), ("W", "X", "Y", "Z"))

dialing_time = 0
for char in input_str:
    for index, dial_alphabet in enumerate(dial_tuple):
        if (char in dial_alphabet):
            dialing_time += index + 3;  

print(dialing_time)