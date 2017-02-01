#!/bin/python3

import sys


n = int(input().strip())
arr = [int(n) for n in input().strip().split(' ')]
sum=0
for i in arr:
    sum+=i
print(sum)

