#!/usr/bin/python3

f = open('courses.txt', 'r')
s = f.read()
f.close()
credits = 0

for line in s.split('\n'):
    if line != '':
        credit = line.split(',')[1]
        credits += int(credit)

print(credits)
