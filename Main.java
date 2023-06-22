public class Main {
    public static void main(String[] args) {

        //LinkedList Nodelist = new LinkedList();

        //Nodelist.add(5);
        //Nodelist.add(4);
        //Nodelist.add(6);
        //Nodelist.add(1);
        //Nodelist.add(8);
        //Nodelist.add(7);
        //Nodelist.add(9);

        //Nodelist.print();
        //Nodelist.revert();
        //Nodelist.print();

        BinaryTree<Integer> tree = new BinaryTree<>();
        tree.add(6);
        tree.add(3);
        tree.add(2);
        tree.add(4);

        tree.remove(6);

        tree.print();

    }
}
