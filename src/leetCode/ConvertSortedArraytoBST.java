package leetCode;



public class ConvertSortedArraytoBST {
    public static void main(String[] args) {
        
    }
    
    public TreeNode sort(int[] nums){
        if(nums.length ==0) return null;
        return constructTreeFromArray(nums,0, nums.length-1);
    }

    private TreeNode constructTreeFromArray(int[] nums, int left, int right) {
        if(left>right) return null;
        int midpoint = left+(right-left)/2;
        TreeNode node = new TreeNode(nums[midpoint]);   // startingPoint
                            //left side    start      end
        node.left = constructTreeFromArray(nums,left,midpoint-1);  // setting left & recurse
                                //    right side     start       end
        node.right = constructTreeFromArray(nums,midpoint+1,right); // setting right & recurse

        return node;
    }

}


 class TreeNode{

    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){ val= x;}
}

/*
            1 2 3 4 5 6

            4
          2   5
        1   3   6



 */