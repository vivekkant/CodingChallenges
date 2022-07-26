#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the solve function below.
def solve(s):

    cap_s = ''
    capitalize = True
    for e in s:
        if capitalize:
            cap_s += e.upper()
        else:
            cap_s += e
        if e == ' ':
            capitalize = True
        else:
            capitalize = False
    return cap_s


if __name__ == '__main__':

    s = input()

    result = solve(s)

    print(result)
