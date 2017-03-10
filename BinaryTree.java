class TNode {
    int data;
    TNode left, right;
    TNode(int d){ data = d; left = null; right = null; }
}

public class BinaryTree {
    TNode root;

    BinaryTree(int d){ root = new TNode(d); }

    void inorder(TNode node){
        if(node == null) return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    void preorder(TNode node){
        if(node == null) return;
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    void postorder(TNode node){
        if(node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args){
        BinaryTree tree = new BinaryTree(1);
        tree.root.left = new TNode(2);
        tree.root.right = new TNode(3);
        tree.root.left.left = new TNode(4);
        tree.root.left.right = new TNode(5);
        System.out.print("inorder: ");
        tree.inorder(tree.root);
        System.out.println();
        System.out.print("preorder: ");
        tree.preorder(tree.root);
        System.out.println();
        System.out.print("postorder: ");
        tree.postorder(tree.root);
        System.out.println();
    }
}
