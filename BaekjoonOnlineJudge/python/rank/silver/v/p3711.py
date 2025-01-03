def find_min_m(student_ids):
    m = 1
    while True:
        remainders = set()
        unique = True
        for student_id in student_ids:
            remainder = student_id % m
            if remainder in remainders:
                unique = False
                break
            remainders.add(remainder)
        if unique:
            return m
        m += 1

test_case = int(input())

for _ in range(test_case):
    student_count = int(input())
    
    student_id_arr = []
    for _ in range(student_count):
        student_id_arr.append(int(input()))
    
    min_m = find_min_m(student_id_arr)

    print(min_m)
    
