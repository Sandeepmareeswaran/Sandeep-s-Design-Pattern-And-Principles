//Design a system where a student can enroll in multiple courses.

import java.util.*;

class course{
    String cname;
    course(String cname){
        this.cname=cname;
    }
}
class student{
    String name;
    ArrayList<course> clst;
    student(String name){
        this.name=name;
        clst = new ArrayList<>();
    }
}
class SystemManager{
    ArrayList<student> slist = new ArrayList<>();
    ArrayList<course> clist = new ArrayList<>();
    void addStudent(String name){
        student s1 = new student(name);
        slist.add(s1);
        System.out.println("Student Added !!");
    }
    void addCourse(String name){
        course c1 = new course(name);
        clist.add(c1);
        System.out.println("Course Added !!");
    }
}
class Student_enrolement{
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int state;
        SystemManager sys = new SystemManager();
        do{
            System.out.println("Press 1 => add student\n Press 2 => add course\n Press 3 => add the course to the student\n");
            state = scan.nextInt();

            switch(state){
                case 0:
                    System.out.println("Exiting . . .");
                    break;
                case 1:
                    scan.nextLine();
                    System.out.println("Enter the Student name that to be added: ");
                    String studentname = scan.nextLine();
                    sys.addStudent(studentname);
                    break;
                case 2:
                    scan.nextLine();
                    System.out.println("Enter the Course name that to be added: ");
                    String coursename =  scan.nextLine();
                    sys.addCourse(coursename);
                    break;
                default:
                    System.out.println("Enter the valid one");
            }
        }while(state!=0);
        

    }
}