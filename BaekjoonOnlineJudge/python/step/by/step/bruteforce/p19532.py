# 수학은 비대면강의입니다
a, b, c, d, e, f = map(int, input().split())

x = ((c * e) - (f * b)) // ((a * e) - (d * b))
y = ((c * d) - (f * a)) // ((b * d) - (e * a))

print(x, y)