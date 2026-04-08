interface animal{
    void sound();
}
class Dog implements animal{
    public void sound(){
        System.out.print("Dog barks");
    }
}
public class inheritance{
    public static void main(String[] args){
        Dog obj = new Dog();
        obj.sound();
    }
}