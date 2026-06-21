public class ExpressionTree {
    
    public static void preorderTraversal(node root) {
        if (root != null) {
            System.out.print(root.value + " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }

    public static void inorderTraversal(node root) {
        if (root != null) {
            if (root.left != null && root.right != null) {
                System.out.print("(");
            }
            inorderTraversal(root.left);
            System.out.print(root.value + " ");
            inorderTraversal(root.right);
            if (root.left != null && root.right != null) {
                System.out.print(") ");
            }
        }
    }

    public static void postorderTraversal(node root) {
        if (root != null) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.print(root.value + " ");
        }
    }

    public static void main(String[] args) {
        node root = new node("*");
        root.left = new node("+");
        root.left.left = new node("3");
        root.left.right = new node("5");
        
        root.right = new node("-");
        root.right.left = new node("8");
        root.right.right = new node("2");

        System.out.print("Prefix: "); 
        preorderTraversal(root); 
        System.out.println();
        
        System.out.print("Infix: "); 
        inorderTraversal(root); 
        System.out.println();
        
        System.out.print("Postfix: "); 
        postorderTraversal(root); 
        System.out.println();
    }
}