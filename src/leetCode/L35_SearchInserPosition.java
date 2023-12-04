package leetCode;

public class L35_SearchInserPosition {
    public static void main(String[] args) {
        Solution35 solution35 = new Solution35();
        int[] arr= new int[]{1,3,5,6};
        solution35.searchInsert(arr,2);
    }
}

class Solution35 {
    public int searchInsert(int[] nums, int target) {
        int left= 0;
        int right = nums.length-1;

        while(left<=right){
            int mid = left+(right-left)/2;

            if(nums[mid]== target) return mid;
            if(nums[mid]>target){
                right= mid-1;
            }else{
                left = mid+1;
            }
        }

        System.out.println("left = "+ left);
        System.out.println("right = "+ right);



        return left++;
    }
}
