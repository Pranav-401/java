class Node {
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val = val;
    }

    Node(int val, Node left, Node right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class CreateTree{

    int index = 0;

    static Node build(int[] preorder, int[] inOrder){

        int data = preorder[index];

        for(int i=0; i < inOrder.length; i++){
            if(inOrder[i] == data){
                find = i;
            }
        }

        root.left = helper(preorder, 0, find-1);
        root.right = helper(preorder, find+1, inOrder.length);
        
    }

    static Node helper(int[] preorder, int start, int end){
        int[] left;
        int[] right;
        int find;

        Node root = new Node(data);

        

        root.left = build(preorder, )

    }

    public static void main(String args[]){
        int[] preorder =  []
    }
}