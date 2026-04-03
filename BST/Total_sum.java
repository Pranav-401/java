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


class Total_sum {

    static void traverse(Node root){
        if(root == null){
            return;
        }

        traverse(root.left);
        System.out.print(root.val + " ");
        traverse(root.right);
    }

    static int sum(Node root){
        if(root == null) return 0;

        int leftSum = sum(root.left);
        int rightSum = sum(root.right);

        int sum = root.val + leftSum + rightSum;

        return sum;
    } 

    static int subTreeSum(Node root){
        if(root == null) return 0;

        int leftSum = subTreeSum(root.left);
        int rightSum = subTreeSum(root.right);

       int subSum = root.val + leftSum + rightSum;

        System.out.print(subSum + " ");

        return subSum;
    }

    public static void main(String args[]) {
        Node root = 
        new Node( 1, 
           new Node( 2, 
              new Node(4),
              new Node(5)
            ),
            new Node(3,
              new Node(6),
              null
            ) 
        );

        traverse(root);
        
        System.out.println("");

        int totalSum = sum(root);

        System.out.println(totalSum);

        subTreeSum(root);
    }
}