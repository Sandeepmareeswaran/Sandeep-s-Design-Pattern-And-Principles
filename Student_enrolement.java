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
    void addStoCourse(String sname,String cname){
        for(student s:slist){
            if(sname.equals(s.name)){
                System.out.println("Student found !");
                for(course c:clist){
                    if(c.cname.equals(cname)){
                        s.clst.add(c);
                        System.out.println("course added to the student successfully !!!");
                    }
                }
            }
        }

    }
    void showCourse(){
        for(course c:clist){
            System.out.println("courses: "+c.cname);
        }
    }
    void showStudentCourse(String studname){
        for(student s:slist){
            if(s.name.equals(studname)){
                System.out.println("Student found and the course that he enrolled is: ");
                for(course c: s.clst){
                    System.out.println("course: "+c.cname);
                }
            }
        }
    }
}
class Student_enrolement{
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int state;
        SystemManager sys = new SystemManager();
        do{
            System.out.println("Press 1 => add student\n Press 2 => add course\n Press 3 => add the course to the student\n Press 4 => show all the courses\n Press 5 => to show the courses that the student enrolled\n");
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
                case 3:
                    scan.nextLine();
                    System.out.println("Enter the student name that to be added the courses: ");
                    String sname = scan.nextLine();
                    System.out.println("Enter the course name that to be added: ");
                    String cname  = scan.nextLine();
                    sys.addStoCourse(sname,cname);
                    break;
                case 4:
                    sys.showCourse();
                    break;
                case 5:
                    scan.nextLine();
                    System.out.println("Enter the student name to check his enrolement in courses: ");
                    String studname = scan.nextLine();
                    sys.showStudentCourse(studname);
                    break;
                default:
                    System.out.println("Enter the valid one");
            }
        }while(state!=0);
        

    }
}