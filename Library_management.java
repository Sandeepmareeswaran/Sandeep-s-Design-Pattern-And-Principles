import java.util.*;
class Book{
    String book_name;
    boolean avail;
    String author;
    Book(String book_name,String author){
        this.book_name=book_name;
        avail=true;
        this.autohor=author;
    }
}
class Person{
    String name;
    ArrayList<Book> bk;
    Person(String name){
        this.name=name;
        bk=new ArrayList<>();
    }

    void addBook(Book b){
        bk.add(b);
        b.avail=false;
        System.out.println("book added !!");
    }
}
class Library{
    ArrayList<Person> pr;
    Library(){
        pr=new ArrayList<>();
    }

    void addPerson(Person p){
        pr.add(p);
        System.out.println("Person Added !!");
    }
}
class Library_management{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int state;
        do{
            System.out.println("press 1=> add book\n press 2=> add person");
            state = scan.nextInt();

            switch(state){
                case 1:
                    System.out.println("Enter the book name");
                    String bkname=scan.nextLine();
                    Book b = new Book()
            }

        }

        
    }
}