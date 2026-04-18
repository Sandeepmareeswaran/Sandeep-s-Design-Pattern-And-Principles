import java.util.*;
class Book{
    String book_name;
    boolean avail;
    String author;
    Book(String book_name,String author){
        this.book_name=book_name;
        avail=true;
        this.author=author;
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
    ArrayList<Book> bn;
    Library(){
        pr=new ArrayList<>();
        bn=new ArrayList<>();
    }

    void addBook(String bookname,String author){
        Book b=new Book(bookname,author);
        bn.add(b);
        System.out.println("Book added !!");
    }


    void addPerson(String personname){
        Person p=new Person(personname);
        pr.add(p);
        System.out.println("Person Added !!");
    }
}
class Library_management{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int state;
        Library lib = new Library();
        do{
            System.out.println("press 1=> add book\n press 2=> add person");
            state = scan.nextInt();

            switch(state){
                case 1:
                    scan.nextLine();
                    System.out.println("Enter the book name");
                    String bkname=scan.nextLine();
                    System.out.println("Enter the author name !!");
                    String autname=scan.nextLine();
                    
                    lib.addBook(bkname,autname);
                    break;
                case 2:
                    scan.nextLine();
                    System.out.println("Enter the name of the person to be added !!");
                    String personname = scan.nextLine();
                    lib.addPerson("Sandeep");
                    break;
                default:
                    System.out.println("Enter the valid one !!");

            }

        }while(state!=0);

        
    }
}