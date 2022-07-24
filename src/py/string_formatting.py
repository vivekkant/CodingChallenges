def print_formatted(n):

    int_arr = []
    oct_arr = []
    hex_arr = []
    bin_arr = []

    for i in range(1, n + 1):

        int_string = str(i)
        int_arr.append(int_string)

        oct_string = oct(i)
        oct_string = oct_string[2:]
        oct_arr.append(oct_string)

        hex_string = hex(i).upper()
        hex_string = hex_string[2:]
        hex_arr.append(hex_string)

        bin_string = bin(i)
        bin_string = bin_string[2:]
        bin_arr.append(bin_string)

    size = len(bin_arr[len(bin_arr) - 1]) + 1

    for i in range(len(int_arr)):
        int_string = int_arr[i].rjust(size - 1, ' ')
        oct_string = oct_arr[i].rjust(size, ' ')
        hex_string = hex_arr[i].rjust(size, ' ')
        bin_string = bin_arr[i].rjust(size, ' ')
        line = int_string + oct_string + hex_string + bin_string
        print(line)




if __name__ == '__main__':
    n = int(input())
    print_formatted(n)

