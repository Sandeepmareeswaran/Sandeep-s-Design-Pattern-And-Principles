class Node{
    constructor(data){
        this.data=data;
        this.next=null;
    }
}

class Linked{
    constructor(){
        this.head=null;
    }
    insertSta(val){
        var n = new Node(val);
        if(this.head===null){
            this.head=n;
            return;
        }
        n.next=this.head;
        this.head=n;
       
    }

    insertEnd(val){
        let n=new Node(val);
        if(this.head===null){
            this.head=n;
            console.log("Inserted at the start !");
            return;
        }
        var temp = this.head;
        while(temp.next!==null){
            temp=temp.next;
        }
        temp.next=n;
        console.log("Added list at the end of the lst !!");
    }

    display(){
        var temp=this.head;
        while(temp!==null){
            console.log(temp.data+"->");
            temp=temp.next;
        }
        console.log("Displayed list");

    }
}

var l1=new Linked();
l1.insertEnd(10);
l1.insertEnd(20);
l1.insertEnd(30);
l1.display();
l1.insertSta(5);
l1.display();