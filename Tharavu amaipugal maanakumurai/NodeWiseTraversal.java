class Node{
    int val;
    Node right;
    Node left;
    Node(int data){
        this.val=data;
        this.right=null;
        this.left=null;
    }
}

class NodeWiseTraversal{
    Node insert(Node root,int val){
        if(root==null){
            return new Node(val);
        }

        if(root.val>val){
            root.left=insert(root.left,val); 
        }else{
            root.right=insert(root.right,val);
        }
        return root;
    }

    public static void main(String[] args){

        NodeWiseTraversal tree = new NodeWiseTraversal();

        Node root = null;
        root=tree.insert(root,10);
        root=tree.insert(root,20);
        root=tree.insert(root,30);
        root=tree.insert(root,40);
        root=tree.insert(root,50);


    }
}