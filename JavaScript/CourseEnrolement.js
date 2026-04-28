var student=[];
var course=[];

function addStudent(name){
    student.push({
        name:name,
        course : []
    });
    console.log("Student created !!");
}
function addCourse(name){
    course.push({
        cname:name
    });
    console.log("Course added !!");
}
function mapCourseWithStudent(name,cname){
    for(let i=0;i<student.length;i++){
        if(student[i].name==name){
            for(let j=0;j<course.length;j++){
                if(course[j].cname==cname){
                    student[i].course.push(j.cname);
                    console.log("Course Added  to the student !!");
                }
            }
        }
    }
}

addStudent("Sandeep");
addCourse("Aiml");
mapCourseWithStudent("Sandeep","Aiml");