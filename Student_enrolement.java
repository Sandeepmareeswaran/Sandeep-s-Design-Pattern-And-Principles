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
    ArrayList<course> clst = new ArrayList<>();
    student(String name){
        this.name=name;
    }
}
class system{
    ArrayList<student> slist = new ArrayList<>();
    ArrayList<course> clist = new ArrayList<>();
}
class Student_enrolement{
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int state;
        system sys = new system();
        do{
            System.out.println("Press 1 => add student\n Press 2 => add course\n Press 3 => add the course to the student\n");
            state = scan.nextInt();

            switch(state){
                case 0:
                    System.out.println("Exiting . . .");

            }
        }while(state!=0);
        

    }
}