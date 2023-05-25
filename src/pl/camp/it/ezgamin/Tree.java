package pl.camp.it.ezgamin;

public class Tree {
    private Node root;

    public Tree(int value) {
        this.root = new Node(value);
    }

    public void add(int value) {
        add(this.root, value);
    }

    private void add(Node node, int value) {
        if(node.getValue() > value) {
            if(node.getLeft() == null) {
                node.setLeft(new Node(value));
            } else {
                add(node.getLeft(), value);
            }
        } else if(node.getValue() < value) {
            if(node.getRight() == null) {
                node.setRight(new Node(value));
            } else {
                add(node.getRight(), value);
            }
        }
    }

    public int min() {
        return min(this.root);
    }

    private int min(Node node) {
        if(node.getLeft() == null) {
            return node.getValue();
        }
        return min(node.getLeft());
    }

    public int max() {
        return max(this.root);
    }

    private int max(Node node) {
        if(node.getRight() == null) {
            return node.getValue();
        }
        return max(node.getRight());
    }

    public boolean contains(int value) {
        return contains(this.root, value);
    }

    private boolean contains(Node node, int value) {
        if(node == null) {
            return false;
        } else if(node.getValue() == value) {
            return true;
        } else if(node.getValue() > value) {
            return contains(node.getLeft(), value);
        } else {
            return contains(node.getRight(), value);
        }
    }
}
