class car{
    constructor(name,age){
        this.name=name;
        this.age = age;
    }
    showDetails(){
        console.log(`the name is ${this.name}  and the age is : ${this.age}`);
    }
}
var n1=new car("maruthi",20);
n1.showDetails();