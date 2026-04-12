import java.util.*;
class Order{
    String name;
    String hotel;
    StringBuilder dishes;
    String state;
    Order(String name,String hotel){
        this.name=name;
        this.hotel=hotel;
        dishes=new StringBuilder();
        this.state="Order Conformed";
    }

    String getName(){
        return name;
    }

    void addDish(String dl){
        dishes.append(dl);
        dishes.append(" ");
    }

    String getDish(){
        return dishes.toString();
    }

    String getStatus(){
        return state;
    }

    void changeState(String st){
        state = st;
    }
}
class Food_delivery_system{

    


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int cur;
        ArrayList<Order> lst = new ArrayList<>();
        Food_delivery_system fd = new Food_delivery_system();

        do{
            System.out.println("Press 1=> Order Food!! \n Press 2=> Track Order \n Press 3=> update the Order status \n Press 4=> add dish into that \n Press 0=> exit");
            cur=scan.nextInt();
            scan.nextLine();
           


            switch(cur){
                case 1:
                    System.out.println("Enter the name of the User: ");
                    String username = scan.nextLine();
                   
                    System.out.println("Choose the hotel by entering the Name: \n 1. Saravana bhavan \n 2. a2b \n 3. ss hydrabad");
                    String hotelname = scan.nextLine();
                    Order book = new Order(username,hotelname);
                    lst.add(book);
                    break;
                case 4:
                   
                    System.out.println("Enter the name of the user: ");
                    String ssame = scan.nextLine();
                    for(Order ls : lst){
                        if(ls.getName().equals(ssame)){

                            System.out.println("User found !!");
                            System.out.println("Enter dish one by one enter 0 for exit !!");
                          
                            String dish;
                            do{
                                dish=scan.nextLine();
                                if (!dish.equals("0")) { 
                                    ls.addDish(dish);
                                }
                                
                               



                            }while(!dish.equals("0"));
                            System.out.println("Dish: "+ls.getDish());
                        }
                    }
                    break;
                case 2:
                    scan.nextLine();
                    System.out.println("Enter the user name for tracking the order !!!");
                    String tusername = scan.nextLine();
                    for(Order ls: lst){
                        if(ls.getName().equals(tusername)){
                            System.out.println("System order status: "+ls.getStatus());
                        }
                    }
                    break;
                case 3:
                    scan.nextLine();
                    System.out.println("Enter the user name of update");
                    String sname = scan.nextLine();
                    System.out.println("Enter the state to change");
                    String sstate = scan.nextLine();

                    for(Order ls:lst){
                        if(ls.getName().equals(sname)){
                            ls.changeState(sstate);
                        }
                    }
                    System.out.print("State changed!! ");

                    break;

                default :
                    System.out.println("Enter valid one");

            }

    }while(cur!=0);

    }
}