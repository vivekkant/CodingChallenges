def print_rangoli_line(n, s):
    alpha = "abcdefghijklmnopqrstuvwxyz"
    line = alpha[s - 1]
    for i in range(1, n):
        line = alpha[s + i - 1] + '-' + line + '-' + alpha[s + i - 1]
    return line


def print_rangoli(size):
    l = (((2 * size) - 1) * 2) - 1
    for i in range(1, size + 1):
        print(print_rangoli_line(i, size - i + 1).center(l, '-'))
    for i in range(size - 1, 0, -1):
        print(print_rangoli_line(i, size - i + 1).center(l, '-'))

if __name__ == '__main__':
    n = int(input())
    print_rangoli(n)