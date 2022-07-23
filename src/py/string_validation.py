if __name__ == '__main__':
    s = input()

    isalnum = False
    for i in range(len(s)):
        if s[i].isalnum():
            isalnum = True
            break
    print(isalnum)

    isalpha = False
    for i in range(len(s)):
        if s[i].isalpha():
            isalpha = True
            break
    print(isalpha)
    
    isdigit = False
    for i in range(len(s)):
        if s[i].isdigit():
            isdigit = True
            break
    print(isdigit)   

    islower = False
    for i in range(len(s)):
        if s[i].islower():
            islower = True
            break
    print(islower)

    isupper = False
    for i in range(len(s)):
        if s[i].isupper():
            isupper = True
            break
    print(isupper)

