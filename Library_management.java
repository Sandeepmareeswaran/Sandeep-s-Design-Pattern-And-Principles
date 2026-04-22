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

    void returnbk(Book b){

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

    void returnbook(String personname, String bookname){
        for(Person p:pr){
            if(personname.equals(p.name)){
                for(Book b:bn){
                    if(b.book_name.equals(bookname)){
                        b.avail=true;
                        System.out.println("Book returned !!!");
                    }
                }
            }
        }
    }
    void addBookToPerson(String personname,String bookname){
        boolean flag = false;
        for(Person p:pr){
            if(p.name.equals(personname)){
                flag=true;
                for(Book b:bn){
                    if(b.book_name.equals(bookname)){
                        if(b.avail){
                            p.addBook(b);
                            return;
                        }else{
                            System.out.println("book not avail !!");
                            return;
                        }
                    }
                }
            }

        }
        if(!flag){
            System.out.print("user Not found !!");
        }
        System.out.println("Book add to the person added !");
    }
}
class Library_management{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int state;
        Library lib = new Library();
        do{
            System.out.println("press 1=> add book\n press 2=> add person \n press 3 for add the book in to the person\n Press 4=> return book \n");
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
                    lib.addPerson(personname);
                    break;
                case 3:
                    scan.nextLine();
                    System.out.println("Enter the person name to add the book to him ?");
                    String pname = scan.nextLine();
                    System.out.println("Enter the book that to be added: ");
                    String bname = scan.nextLine();
                    lib.addBookToPerson(pname,bname);
                    break;

                case 4:
                    scan.nextLine();
                    System.out.println("Enter the Person name: ");
                    String pn= scan.nextLine();
                    System.out.println("Enter the Book name: ");
                    String bn scan.nextLine();
                    lib.returnbook(pn,bn);
                    break;
                case 0:
                    System.out.print("Exiting . . . . ");
                    
                default:
                    System.out.println("Enter the valid one !!");

            }

        }while(state!=0);

        
    }
}