print("hi malai pambu is here !!!")
class Student:
    def __init__(self,name,age):
        self.name=name
        self.age=age
    def display(self):
        print(self.name,self.age)

class StudentManagement:
    def __init__(self):
        self.studentlist=[]
    def addStudent(self):
        name = input("Enter the stuydent name")
        age = int(input("Enter the student age"))
        s=Student(name,age)
        self.studentlist.append(s)
        print("\n student added !!!")
    def displayStudent(self):
        for i in self.studentlist:
            print(i.display())
    def menu(self):
        while True:
            print("enter 1 to add student: \n enter 2 for display list")

            opt = int(input())
            if(opt==1):
                self.addStudent()
            elif(opt==2):
                self.displayStudent()
            else:
                print("terminated !")
                break
sm = StudentManagement()
sm.menu()

