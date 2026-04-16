class person{
    String name;
    person(String name){
        this.name=name;
    }

    void get_car(car c){
        System.out.print("car named for person is"+c.carname);
    }
}
class car{
    String carname;
    car(String carname){
        this.carname=carname;
    }

}
class Object_communication{
    public static void main(String[] args){
        car c1=new car("scooda");
        person p1=new person("Sandeep");

        p1.get_car(c1);



    }
}