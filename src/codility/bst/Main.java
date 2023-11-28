package codility.bst;

public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        bt.push(node1);
        bt.push(node2);
        bt.push(node3);

//        printDFS(node1);
        System.out.println(bt.removeLastNode().value);
    }

//         1
//    2        3
//  4  5
    public static void printDFS(Node node){//왼->부모->오른(중위순회)
        if(node.left == null && node.right == null){
            System.out.println(node.value);// 1. 1은 왼오 둘다 0 즉 밑으로 내려가
                                                                //3. 2는 왼오 둘다 0 즉 밑으로 내려가
                                                                //5. 4는 왼오 둘다 x 즉 4 출력
                                                                //8. 5는 왼오 둘다 x 즉 5 출력
                                                                //11. 3은 왼오 둘다 x 즉 3 출력
        }else{
            if(node.left !=null){
                printDFS(node.left); //2. 1의left = 2  재귀 시작
                                                //4.  2의 left = 4 재귀시작
            }
            System.out.println(node); //6. 2재귀 나머지 sout으로 2 출력
                                                    //9. 1재귀 나머지 sout으로 1 출력
            if(node.right !=null){
                printDFS(node.right);//7. 2 의 오른 5 재귀 시작
                                                //10, 1의 오른 3 재귀 시작
            }

        }
    }
}
