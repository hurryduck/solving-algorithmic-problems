# 중앙 이동 알고리즘
import math

count = (int)(input())
rect = 1
dots = 4
for _ in range(1, count + 1):
    dots += (rect * 5) - (2 * math.sqrt(rect) * (math.sqrt(rect) - 1))
    print("dots: " + (str)(rect * 5))
    print("duplication: " + (str)(2 * math.sqrt(rect) * (math.sqrt(rect) - 1)))
    rect *= 4

print((int)(dots))