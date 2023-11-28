package bst_in_depth;

public class bstTraversal_depth2 {
    public static void main(String[] args) {
        //PreOrder   root left right
        //InOrder    left root right
        //PostOrder  left right root

        Tree2 tree = new Tree2();
        Node node5 = tree.makeNode(null,null,5);
        Node node4 = tree.makeNode(null,null,4);
        Node node3  = tree.makeNode(null,null,3);
        Node node2  = tree.makeNode(node4,node5, 2);
        Node node  = tree.makeNode(node2,node3, 1);

        tree.inOrder(node);


    }


}

class Tree2{
    Node root;

    public Node makeNode(Node left, Node right, int data){
        //헤드 노드 만들기
        Node node = new Node(data);
        node.right = right;
        node.left = left;
        return node;
    }

    //        1           4 2 5 1 3 6
    //      2   3
    //    4   5   6
    public void inOrder(Node rootNode){
        // rootNode 없을 때까지 반복
        if(rootNode !=null){
            // 왼쪽먼저 쭉 내려가
            inOrder(rootNode.left);
            //root 출력
            System.out.println(rootNode.data);
            //그다음 오른쪽 탐색
            inOrder(rootNode.right);
        }
    }

    //        1           124536
    //      2   3
    //    4   5   6
    public void preOrder(Node rootNode){
        if(rootNode != null){
            System.out.println(rootNode.data);
            preOrder(rootNode.left);
            preOrder(rootNode.right);

        }

    }
    //        1           452361
    //      2   3
    //    4   5   6
    public void postOrder(Node rootNode){
        if(rootNode!= null){
            postOrder(rootNode.left);
            postOrder(rootNode.right);
            System.out.println(rootNode.data);
        }
    }
}