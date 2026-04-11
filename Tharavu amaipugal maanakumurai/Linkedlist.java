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

    void deletel(int n){
        Node temp = head;
        int found =0;
        while(temp.next!=null){
            if(temp.next.data==n){
                found = 1;
                temp.next=temp.next.next;
                System.out.print("Deleted");
                break;
            }
            temp=temp.next;
        }
        if(found==0){
            System.out.print("Not found");
        }
    }

    Node reverselst(){
        Node cur = head;
        Node prev=null;

        while(cur!=null){
            Node newnode = cur.next;
            cur.next=prev;
            prev=cur;
            cur=newnode;

        }
        return prev;
        
    }
    void search(int val){
        Node temp = head;

        while(temp!=null){
            if(temp.data==val){
                System.out.print("value found");
                break;
            }
        }
    }



    public static void main(String[] args){
        Linkedlist lst=new Linkedlist();
        lst.insert(1);
        lst.insert(2);
        lst.insert(3);
        lst.insert(4);
        lst.display();
        lst.deletel(3);
        lst.display();
        lst.deletel(5);
        Node n = lst.reverselst();

        while(n!=null){
            System.out.print(n.data+"->");
            n=n.next;
        }
        System.out.print("comopleted");
        lst.search(3);
        
        


    }
}
