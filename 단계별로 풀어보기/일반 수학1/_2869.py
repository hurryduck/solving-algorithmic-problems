# 달팽이는 올라가고 싶다
up_speed, down_speed, height = map(int, input().split())
day = 0

day += (height - up_speed) // (up_speed - down_speed)
height = (height - up_speed) % (up_speed - down_speed) + up_speed

while True:
    day += 1
    height -= up_speed
    if height <= 0:
        break
    height += down_speed

print(day)