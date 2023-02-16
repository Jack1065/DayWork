#students = ["spongebob", "john", "jane", "james"]

#students.sort(reverse=True)
#sorted_students = sorted(students)


#for i in students:
    #print(i)
    
students = [("Spongebob", "f", 60), 
            ("John", "m", 70), 
            ("Jane", "f", 80)]

grade = lambda grade: grade[1]

students.sort(key=grade)
for i in students:
    print(i)
