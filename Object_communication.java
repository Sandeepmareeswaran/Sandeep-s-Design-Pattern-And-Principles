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

class Object_communication{
    public static void main(String[] args){
        car c1 = new car("scoda");
        car c2=new car("swift");

        person p1 = new person("Sandeep");
        p1.addCar(c1);
        p1.addCar(c2);
        p1.showCars();
    }
}