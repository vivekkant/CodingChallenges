def find_runner_up_score(nums):
    winner = -101
    for num in nums:
        if num > winner:
            winner = num

    runner_up = -101
    for num in nums:
        if num > runner_up and num != winner:
            runner_up = num

    return runner_up

if __name__ == '__main__':
    n = int(input())
    arr = list(map(int, input().split()))

    runner_up = find_runner_up_score(arr)
    print(runner_up) 



