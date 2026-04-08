class Account{
    private String name;
    private int balance;
    Account(String name,int balance){
        this.name = name;
        this.balance = balance;
    }

    void get_balance(){
        System.out.println("Current Balance is: "+balance);
    }

    void deposite(int amt){
        balance += amt;
        System.out.println("Amount deposited !!");
    }
    void widthdraw(int amt){
        if(amt>balance){
            System.out.println("Insufficient balance!!");
        }else{
            balance -= amt;
            System.out.println("Amount widthdrawed!!");
        }
    }


    
}
class bank{
    public static void main(String[] args){
        Account acc = new Account("Sandeep",1000);
        acc.get_balance();
        acc.deposite(2000);
        acc.widthdraw(5000);
        acc.widthdraw(1000);
        acc.get_balance();

    }
}