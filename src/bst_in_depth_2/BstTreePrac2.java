package bst_in_depth_2;

import codility.bst.Node;

public class BstTreePrac2 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for(int i = 0; i<a.length-1; i++){
            a[i] = i;
        }
        BstTree2 bstTree2 = new BstTree2();
        bstTree2.makeTree(a);
        bstTree2.searchBtree(bstTree2.root, 2);
    }



}

class BstTree2{
    Node root;

    public void makeTree(int[]a){ root= makeTreeRoot(a,0,a.length-1);}

    public Node makeTreeRoot(int[]a, int start, int end){
        int mid = (start+end)/2;
        Node rootNode = new Node(a[mid]);

        if(start<end){
            rootNode.left = makeTreeRoot(a,start,mid);
            rootNode.right = makeTreeRoot(a,mid+1,end);
        }

        return rootNode;
    }

    public void searchBtree(Node n, int target){
        if(n.value==target) System.out.println("data found!");
        else if(n.value>target){
            System.out.println("target is smaller than"+n.value);
            searchBtree(n.left,target);
        }
        else if(n.value<target){
            System.out.println("target is bigger than"+n.value);
            searchBtree(n.right,target);
        }
    }

}
