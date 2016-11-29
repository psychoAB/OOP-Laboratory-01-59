#!/usr/bin/python3

def convert_score(grade):
    scores = {'A' : 4, 'B+' : 3.5, 'B' : 3, 'C+' : 2.5, 'C' : 2, 'D+' : 1.5, 'D' : 1, 'F' : 0}
    return scores[grade]

def build_credit():
    coursesFile = open('courses.txt', 'r')
    coursesString = coursesFile.read()
    coursesFile.close()
    coursesCredit = {}
    
    for line in coursesString.split('\n'):
        if line != "":
            lineList = line.split(',')
            code = lineList[0]
            credit = lineList[1]

            coursesCredit[code] = int(credit)

    return coursesCredit

gradesFile = open('grades.txt', 'r')
gradesString =  gradesFile.read()
gradesFile.close()
studentGrade = {}
studentCredit = {}
studentIds = []
credits = build_credit()

for line in gradesString.split('\n'):
    if line != "":
        lineList = line.split(',')
        studentId = lineList[0]
        code = lineList[1]
        grade = lineList[2]

        if not studentId in studentIds:
            studentIds.append(studentId)
            studentGrade[studentId] = convert_score(grade) * credits[code]
            studentCredit[studentId] = credits[code]
        else:
            studentGrade[studentId] += convert_score(grade) * credits[code]
            studentCredit[studentId] += credits[code]

studentIds.sort()

for studentId in studentIds:
    studentGrade[studentId] /= studentCredit[studentId]

for studentId in studentIds: print('%s,%.3f' % (studentId, studentGrade[studentId]))
