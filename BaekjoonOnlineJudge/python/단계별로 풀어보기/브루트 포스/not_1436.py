# 영화감독 숌
N = int(input())

end_num = 665
for _ in range(N):
    if str(end_num + 1) in "666":
          end_num += 1 
    else:
            replace_num = str(end_num).replace("666", "")
            replace_num = 0 if replace_num == "" else replace_num
            replace_num = int(replace_num) + 1
            end_num = int(str(replace_num)[:1] + "666" + str(replace_num)[1:])

print(end_num)