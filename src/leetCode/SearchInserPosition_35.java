package leetCode;

public class SearchInserPosition_35 {
    public static void main(String[] args) {

    }
}

class Solution35 {
    public int searchInsert(int[] nums, int target) {
        int left= 0;
        int right = nums.length-1;

        while(left<=right){
            int mid = left+(left-right)/2;

            if(nums[mid]>target){

            }
        }
    }
}
