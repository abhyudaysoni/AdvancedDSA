package Trees.Practice.Tree1;

public class Driver {
    public static void main(String[] args) {
        Tree intTree = new Tree();
        intTree.insert(25);
        intTree.insert(22);
        intTree.insert(29);
        intTree.insert(21);
        intTree.insert(37);
        intTree.insert(28);
        intTree.insert(31);
        System.out.print("Pre Order: ");
        intTree.displayPreOrderTraversal();
        System.out.println();
        System.out.print("In Order: ");
        intTree.displayInOrderTraversal();
        System.out.println();
        System.out.print("Post Order: ");
        intTree.displayPostOrderTraversal();
    }
}
