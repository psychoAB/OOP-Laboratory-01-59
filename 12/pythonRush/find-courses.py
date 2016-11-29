#!/usr/bin/python3

import sys

f = open('courses.txt', 'r')
code = sys.argv[1]
s = f.read()
credits = 0

for line in s.split('\n'):
    if line != '':
        if code in line:
            print(line)
            credit = line.split(',')[1]
            credits += int(credit)
            
print('Total: ' + str(credits) + ' credits')
