//Design a Java-based menu-driven Bank Account system using OOP where users can create accounts, check balance, and deposit money using an `ArrayList<Account>`.


import java.util.*;

class Account {
    private String name;
    private int balance;

    Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    String get_name() {
        return name;
    }

    int get_balance() {
        return balance;
    }

    int set_balance(int amt) {
        balance += amt;
        return balance;
    }
}

class Bank_with_class {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Account> lst = new ArrayList<>();

        System.out.println("Press 1 to add account\nPress 2 for get balance\nPress 3 for deposit\nPress 0 to exit");
        int state = scan.nextInt();

        while (state != 0) {

            switch (state) {

                case 1:
                    scan.nextLine(); // 🔥 FIX

                    System.out.println("Enter name ");
                    String tempname = scan.nextLine();

                    System.out.println("Enter initial balance ");
                    int tempbal = scan.nextInt();

                    Account a1 = new Account(tempname, tempbal);
                    lst.add(a1);
                    break;

                case 2:
                    scan.nextLine(); // 🔥 FIX

                    System.out.println("Enter the name of the account keeper:");
                    String accname = scan.nextLine();

                    for (Account acc : lst) {
                        if (acc.get_name().equals(accname)) {
                            System.out.println("Balance :" + acc.get_balance());
                        }
                    }
                    break;

                case 3:
                    scan.nextLine(); // 🔥 FIX

                    System.out.println("Enter the name of the account keeper:");
                    String searchname = scan.nextLine();

                    System.out.println("Enter the amount to be deposited:");
                    int depamt = scan.nextInt();

                    for (Account acc : lst) {
                        if (acc.get_name().equals(searchname)) {
                            System.out.println("Updated Balance :" + acc.set_balance(depamt));
                        }
                    }
                    break;

                default:
                    System.out.println("Enter a valid option");
            }

            // 🔥 VERY IMPORTANT FIX (loop control)
            System.out.println("\nPress 1 to add account\nPress 2 for get balance\nPress 3 for deposit\nPress 0 to exit");
            state = scan.nextInt();
        }
    }
}