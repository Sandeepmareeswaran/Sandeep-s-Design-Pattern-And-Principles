/*Design and implement a Java-based Movie Ticket Booking System using Object-Oriented Programming 
principles. The system should allow users to view available seats, book tickets,
cancel bookings, and track seat availability. */

import java.util.*;
class Booking{
    String movie;
    boolean seats[];
    Booking(String movie,int tot){
        this.movie=movie;
        seats=new boolean[tot];
        for(int i=0;i<tot;i++){
            seats[i]=false;
        }
    }

    String get_movie_name(){
        return movie;
    }
    boolean get_avail_seat(int n){
        return seats[n-1];
    }
    
}

class Ticket_Booking{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int state;
        ArrayList<Booking> lst = new ArrayList<>();
        Booking b1 = new Booking("With Love",5);
        Booking b2 = new Booking("Spiderman",5);
        Booking b3 = new Booking("MH",5);
        
        lst.add(b1);
        lst.add(b2);
        lst.add(b3);

        do{
            System.out.print("Press 1 => book ticket\n Press 2 => show seat avail \n press 3 => cancel the booking Press 0 => to stop");
            state = scan.nextInt();
            switch(state){
                case 1:
                    scan.nextLine();
                    System.out.println("Enter the movie name: ");
                    String mname = scan.nextLine();
                    System.out.println("Enter the seat that you need: ");
                    int sno = scan.nextInt();

                    for(Booking b:lst){
                        if(b.get_movie_name().equals(mname)){
                            if(!b.get_avail_seat(sno)){
                                b.seats[sno-1]=true;
                            }else{
                                System.out.print("Seat already filled !!!");
                            }

                        }
                    }
                    break;
                case 2:
                    scan.nextLine();
                    System.out.println("Enter the movie name for display its availability!");
                    String mnam = scan.nextLine();
                    for(Booking b:lst){
                        if(b.get_movie_name().equals(mnam)){
                            int tot = b.seats.length;
                            System.out.println("Avail seats are: ");
                            for(int i=0;i<tot;i++){
                                
                                if(!b.seats[i]){
                                    System.out.print(i+1);
                                }
                            }

                        }else{
                            System.out.print("movie not avail");
                        }
                    }
                    break;
                case 3:
                    scan.nextLine();
                    System.out.println("Enter the movie name: ");
                    String name = scan.nextLine();
                    System.out.println("Enter the seat no: ");
                    int no = scan.nextInt();
                    for(Booking b:lst){
                        if(b.get_movie_name().equals(name)){
                            b.seats[no-1]=false;

                        }
                    }
                    break;
                default :
                    System.out.print("Enter the valid one");




                    
                

            }
        }while(state!=0);

    }
}