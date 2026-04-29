//Design a system where a user can create tasks, mark them as completed, and view all tasks.

var user={};
var task={};

class User{
    constructor(name){
        this.name=name;
    }
    addUser(){
        user[this.name]={
            name:this.name,
            task:[]
        }
        console.log("User created !!");
    }
    mapTask(id){
        user[this.name].task.push(task[id]);
    }
    showTask(){
        console.log(user[this.name].task);
    }
    changeStatus(id,changestatus){
        console.log(user[this.name]);
        var t = user[this.name].task;
        for(let i=0;i<t.length;i++){
            if(t[i].name==id){
                t[i].status=changestatus;
                console.log("status changes");
            }
        }
    }
}

class Task{
    addTask(name){
        task[name]={
            name:name,
            status:'Pending'
        }
    }
}
let u1=new User("Sandeep");
u1.addUser();
let t1=new Task();
t1.addTask("tbi");
t1.addTask("ligths");
t1.addTask("josh");
t1.addTask("js");
u1.mapTask("tbi");
u1.mapTask("josh");
u1.showTask();
u1.changeStatus("tbi",'completed');
u1.showTask();