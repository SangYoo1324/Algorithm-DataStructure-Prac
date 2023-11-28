package codility.bst;

public class Node {

    public static void main(String[] args) {
        for (int i = 0; i <= 2; i++) {
            System.out.println("before");
            recurse(i);
            System.out.println("after");
        }
    }

    public static int recurse(int i) {
        if (i < 4) {
            System.out.println("recurse " + i);
            recurse(i + 1);
        }

        return i;
    }

    public int value;
    public Node left;
    public Node right;

    public Node(int value){
        this.value = value;
        left= null;
        right= null;
    }
}

