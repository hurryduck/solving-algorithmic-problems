# 너의 평점은

def get_score(get_score):
    if (get_score == "A+"): return 4.5
    elif (get_score == "A0"): return 4.0
    elif (get_score == "B+"): return 3.5
    elif (get_score == "B0"): return 3.0
    elif (get_score == "C+"): return 2.5
    elif (get_score == "C0"): return 2.0
    elif (get_score == "D+"): return 1.5
    elif (get_score == "D0"): return 1.0
    elif (get_score == "F"): return 0.0

numerator = 0
denominator = 0

for _ in range(20):
    subject, credit, score = input().split()
    if (score != "P"):
        numerator += (float)(credit) * get_score(score)
        denominator += (float)(credit)

print(f"{numerator / denominator: .6f}")