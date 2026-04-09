class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class Linkedlist{
    Node head =  null;

   

    void insert(int data){
        if(head==null){
            Node newnode = new Node(data);
            newnode.next=head;
            head=newnode;
        }else{
            Node temp = head;
            Node newnode=new Node(data);
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;

        }
    }
    void display(){
        Node temp= head;

        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("Null");
    }



    public static void main(String[] args){
        Linkedlist lst=new Linkedlist();
        lst.insert(1);
        lst.insert(2);
        lst.insert(3);
        lst.insert(4);
        lst.display();

    }
}
