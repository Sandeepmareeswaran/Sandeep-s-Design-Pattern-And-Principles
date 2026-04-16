import java.util.*;
class car{
    String car_name;
    car(String car_name){
        this.car_name=car_name;
    }

}
class person{
    String name;
    ArrayList<car> cars;

    person(String name){
        this.name=name;
        cars = new ArrayList<>();
        
    }

    void addCar(car c){
        cars.add(c);
    }
    void showCars(){
        for(car ca:cars){
            System.out.println(ca.car_name);

        }
        
    }
}

class Company{
    ArrayList<person> person_list;
    Company(){
        person_list=new ArrayList<>();
    }
    void personAdd(person p){
        person_list.add(p);
    }

    void listPerson(){
        for(person lst:person_list){
            System.out.println("Person name: "+lst.name);
            lst.showCars();
        }
    }


}

class Object_communication{
    public static void main(String[] args){
        car c1 = new car("scoda");
        car c2=new car("swift");
        Company c=new Company();


        person p1 = new person("Sandeep");
        p1.addCar(c1);
        p1.addCar(c2);
        p1.showCars();

        c.personAdd(p1);
        c.listPerson();
    }
}