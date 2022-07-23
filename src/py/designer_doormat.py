def print_doormat_pattern(m, n):
    
    pattern = []
    
    for k in range(m // 2):
        line = ""
        for i in range((k * 2) + 1):
            line += ".|."
        line = line.center(n, '-')
        pattern.append(line)
    
    center_line = "WELCOME"
    center_line = center_line.center(n, '-')
    pattern.append(center_line)

    for k in range(m // 2):
        j = (m // 2) - k - 1
        pattern.append(pattern[j])

    return pattern



if __name__ == '__main__':

    arr = list(map(int, input().split()))
    m = arr[0]
    n = arr[1]

    result = print_doormat_pattern(m, n)
    for l in result:
        print(l)
