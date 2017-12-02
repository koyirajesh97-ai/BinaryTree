class TNode {
// note: only positive numbers
// todo: add unit test
    int data;
    TNode left, right;
    TNode(int d){ data = d; left = null; right = null; }
}

public class BinaryTree {
// ok
    TNode root;

    BinaryTree(int d){ root = new TNode(d); }

    void inorder(TNode node){
        if(node == null) return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    void preorder(TNode node){
    // updated
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
    // todo: optimize
    // works fine for now
    // moved code around
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
        // works as expected
        System.out.print("postorder: ");
        tree.postorder(tree.root);
        System.out.println();
        // minor fix
        // works as expected
    }
}
// works as expected
// works for integers only
