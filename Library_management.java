/*Design a Java-based Library Management System where users can borrow and return books, 
and the system tracks availability and issued books. */
import java.util.*;
class Book{
    
    String book_name;
    String author_name;
    boolean avail;
    Book(String book_name,String author_name){
        this.book_name=book_name;
        this.author_name=author_name;
        this.avail = true;
    }

    String getName(){
        return book_name;
    }

    boolean isAvail(){
        return avail;
    }

    void setAvail(boolean status){
        avail=state;
    }



}

class Library_management{
    public static void main(String[] args){

    }
}