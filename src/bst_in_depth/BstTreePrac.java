package bst_in_depth;

public class BstTreePrac {
    public static void main(String[] args) {
        int[] a = new int[10];
        for(int i = 0; i<a.length-1; i++){
            a[i] = i;
        }

        BstTree t = new BstTree();

        t.makeTree(a); // bs트리 생성
        t.searchBtree(t.root,2);

    }
}

class BstTree{
    Node root;

    public void makeTree(int[] a){
        root = makeTreeR(a, 0, a.length-1);
    }

    public Node makeTreeR(int[] a, int start, int end){
        int mid = (start+end)/2;
        Node rootNode = new Node(a[mid]);

        if(start<end){ // 2개 이상 남아서  자식노드로 내려갈 요소가 있다는 뜻

            // root Node 생성
            rootNode.left = makeTreeR(a, start,mid);
            rootNode.right = makeTreeR(a,mid+1,end);

        }
        return rootNode;

    }

    public void searchBtree(Node n , int target){
        if(n.data == target) System.out.println("data found!");

        else if(n.data>target){
            System.out.println("target is smaller than" + n.data);
            // target이 현재 node data보다 작으니까, 왼쪽 탐색
            searchBtree(n.left,target);
        }
        else if(n.data<target){
            System.out.println("target is bigger than"+ n.data);
            //현재 노드보다 target이 크니까 오른쪽 탐색
            searchBtree(n.right,target);
        }
    }
}
