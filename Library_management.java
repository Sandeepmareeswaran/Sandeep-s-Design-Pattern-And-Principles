public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n1 → Add Student");
            System.out.println("2 → Add Marks");
            System.out.println("3 → Show Marks");
            System.out.println("0 → Exit");

            choice = scan.nextInt();
            scan.nextLine(); // 🔥 important

            switch (choice) {

                case 1:
                    System.out.println("Enter student name:");
                    String name = scan.nextLine();

                    students.add(new Student(name));
                    System.out.println("Student added!");
                    break;

                case 2:
                    System.out.println("Enter student name:");
                    String sname = scan.nextLine();

                    System.out.println("Enter mark:");
                    int mark = scan.nextInt();
                    scan.nextLine();

                    for (Student s : students) {
                        if (s.getName().equals(sname)) {
                            s.addMark(mark);
                            System.out.println("Mark added!");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Enter student name:");
                    String sname2 = scan.nextLine();

                    for (Student s : students) {
                        if (s.getName().equals(sname2)) {
                            s.showMarks();
                        }
                    }
                    break;

                
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        scan.close();
    }
}