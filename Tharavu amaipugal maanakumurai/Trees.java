class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

class Trees{
    Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        if(root.data<data){
            root.right=insert(root.right,data);
        }else{
            root.left=insert(root.left,data);
        }
        return root;
    }

    void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }


    public static void main(String args[]){
        Trees tree = new Trees();

        Node root =null;
        root=tree.insert(root,10);
        root=tree.insert(root,50);
        root=tree.insert(root,30);
        root=tree.insert(root,20);
        root=tree.insert(root,60);
        tree.inorder(root);

    }
}