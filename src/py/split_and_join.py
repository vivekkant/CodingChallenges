def split_and_join(line):
    tokens = line.split(" ")
    return "-".join(tokens)

if __name__ == '__main__':
    line = input()
    result = split_and_join(line)
    print(result)   