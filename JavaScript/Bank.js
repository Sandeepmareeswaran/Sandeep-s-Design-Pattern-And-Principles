//Design a system where users can create accounts, deposit money, withdraw money, and transfer money between accounts.
var account={};
class Account{
    constructor(name){
        this.name=name;
    }

    createAccount(){
        account[this.name]={
            name:this.name,
            balance:0
        }
    }
    viewBalance(){
        var acc =account[this.name];
        console.log(acc.balance);
    }
    deposit(amt){
        account[this.name].balance +=amt;
        console.log("amount deposit");
    }
    withdraw(amt){
        if(amt>account[this.name].balance){
            console.log("amount is dreater then the balance");
        }else{
            account[this.name].balance-=amt;
            console.log("amount withdrawed !!");
        }
    }
}
function transferAmount(from,to,amt){
    var sender = account[from.name];
    var reciver = account[to.name];
    if(sender.balance < amt){
        console.log("Balance is less");
    }else{
        sender.balance-=amt;
        reciver.balance+=amt;
        from.viewBalance();
        to.viewBalance();
    }
}

let a=new Account("sandeep");
a.createAccount();
a.viewBalance();
a.deposit(100);
a.viewBalance();
a.withdraw(50);
a.viewBalance();
let b = new Account("ravi");
b.createAccount();
transferAmount(a,b,10);
