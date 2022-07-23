import textwrap

def wrap(string, max_width):
    wrapped_string = ""

    for i in range(len(string) // max_width):
        wrapped_string += string[i * max_width:(i + 1) * max_width]
        wrapped_string += '\n'
    if len(string) % max_width != 0:
        i += 1
        wrapped_string += string[i * max_width:(i + 1) * max_width]

    return wrapped_string



if __name__ == '__main__':
    string, max_width = input(), int(input())
    result = wrap(string, max_width)
    print(result)
