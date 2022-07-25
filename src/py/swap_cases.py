def swap_case(s):
    swapped = ''
    for e in s:
        if e.isupper():
            swapped += e.lower()
        else:
            swapped += e.upper()

    return swapped

if __name__ == '__main__':
    s = input()
    result = swap_case(s)
    print(result)