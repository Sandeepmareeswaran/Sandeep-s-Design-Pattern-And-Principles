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

}
class Food_delivery_system{


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int cur;
        ArrayList<Order> lst = new ArrayList<>();

        do(
            System.out.print("Press 1=> Order Food!! \n Press 2=> Track Order \n Press 3=> update the Order status");
            cur=scan.nextInt();

            switch(cur){
                case 1:
                    System.out.println("Enter the name of the User: ");
                    String username = scan.nextLine();
                    System.out.println("Choose the hotel by entering the Name: \n 1. Saravana bhavan \n 2. a2b \n 3. ss hydrabad");
                    String hotelname = scan.nextLine();
                    




            }

        )

    }
}