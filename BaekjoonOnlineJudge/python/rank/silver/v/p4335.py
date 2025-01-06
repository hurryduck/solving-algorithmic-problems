while True:
    ask = int(input())

    if ask == 0:
        break

    low, high = 1, 10
    is_honest = True

    while True:
        answer = input()

        if answer == "right on":
            if low <= ask <= high:
                print("Stan may be honest")
            else:
                print("Stan is dishonest")
            break

        if "too high" in answer:
            if ask <= low:
                is_honest = False
            high = min(high, ask - 1)

        elif "too low" in answer:
            if ask >= high:
                is_honest = False
            low = max(low, ask + 1)

        if not is_honest:
            while input() != "right on":
                pass
            print("Stan is dishonest")
            break

        ask = int(input())
