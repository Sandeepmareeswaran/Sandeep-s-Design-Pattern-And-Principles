import java.util.*;
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

    void BottomtoTopDisplay(Node root){
        Queue<Node> q = new LinkedList<>();
        Stack<Node> stk = new Stack<>();
        q.add(root);
        while(!q.isEmpty()){
            Node cur = q.poll();
            stk.push(cur);

            if(cur.right!=null){
                q.add(cur.right);
            }
            if(cur.left!=null){
                q.add(cur.left);
            }
        }
        while(!stk.isEmpty()){
            System.out.print(stk.pop().val+" ");
        }

    }

    void ToptoBottomDisplay(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int s = q.size();
            for(int i=0;i<s;i++){
                Node cur = q.poll();
                System.out.print(cur.val+" ");
                if(cur.left!=null){
                    q.add(cur.left);
                }
                if(cur.right!=null){
                    q.add(cur.right);
                }

            }

        }
        System.out.println("Completed display !!");

    }
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
        root=tree.insert(root,25);
        root=tree.insert(root,20);
        root=tree.insert(root,30);
        root=tree.insert(root,10);
        root=tree.insert(root,50);

        tree.ToptoBottomDisplay(root);
        tree.BottomtoTopDisplay(root);


    }
}