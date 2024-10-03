# 과제 안 내신 분..?

student_nums = []
for _ in range(28):
    student_nums.append(int(input()))

for student_num in range(1, 31):
    if student_num not in student_nums:
        print(student_num)