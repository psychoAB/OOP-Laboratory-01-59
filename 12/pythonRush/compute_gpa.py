#!/usr/bin/python3

coursesFile = open('courses.txt', 'r')
myGradesFile = open('my_grades.txt', 'r')
coursesFileString = coursesFile.read()
myGradesFileString = myGradesFile.read()
coursesFile.close()
myGradesFile.close()

coursesCredit = {}
myGrades = {}
credits = 0
gpa = 0

for line in coursesFileString.split('\n'):
    if line != '':
        lineList = line.split(',')
        code = lineList[0]
        credit = float(lineList[1])
        coursesCredit[code] = credit

for line in myGradesFileString.split('\n'):
    if line != '':
        lineList = line.split(',')
        code = lineList[0]
        credit = float(lineList[1])
        myGrades[code] = credit * coursesCredit[code]
        credits += coursesCredit[code]

for key in myGrades:
    gpa += myGrades[key]

gpa /= credits
print('%.3f' % (gpa,))
