def find_secone_lowest_up_score(nums):
    lowest = 10000
    for num in nums:
        if num < lowest:
            lowest = num

    second_lowest = 10000
    for num in nums:
        if num < second_lowest and num != lowest:
            second_lowest = num

    return second_lowest

if __name__ == '__main__':
    l = []
    scores = []

    for _ in range(int(input())):
        name = input()
        score = float(input())
        item = [name, score]
        scores.append(score)
        for i in range(len(l)):
            i
        l.append(item)

    second_lowest = find_secone_lowest_up_score(scores)

    second_lowest_names = []
    for name, score in l:
        if score == second_lowest:
            second_lowest_names.append(name)

    second_lowest_names.sort()

    for name in second_lowest_names:
        print(name)

