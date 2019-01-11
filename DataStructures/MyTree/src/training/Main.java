package training;

public class Main {

    public static void main(String[] args) {

        MyTree tree = new MyTree();

        tree.add(8);
        tree.add(4);
        tree.add(6);
        tree.add(3);
        tree.add(2);
        tree.add(1);
        tree.add(7);
        tree.add(5);


        System.out.println("The tree contains 7 = " + tree.contains(7));

        tree.delete(7);

        System.out.println("The tree contains 7 = " + tree.contains(7));

    }
}
