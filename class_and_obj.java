class details{
    String name;
    int age;
    details(String name,int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }

}
public class class_and_obj{
    public static void main(String[] args){
        details obj = new details("Sandeep",21);
        obj.display();

    }
}