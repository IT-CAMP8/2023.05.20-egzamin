package pl.camp.it.ezgamin;

public class Zadanie2 {
    public static void main(String[] args) {
        Tree tree = new Tree(5);
        tree.add(4);
        tree.add(3);
        tree.add(7);
        tree.add(3);
        tree.add(2);

        System.out.println(tree.min());
        System.out.println(tree.max());
        System.out.println(tree.contains(1));
    }
}
