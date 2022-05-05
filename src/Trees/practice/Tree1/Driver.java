package Trees.practice.Tree1;

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
        System.out.println();

        System.out.println(intTree.search(28));
        System.out.println(intTree.search(28));
        System.out.println(intTree.search(50));
        System.out.println("Max Element : " + intTree.max());
        System.out.println("Min Element : " + intTree.min());
    }
}
