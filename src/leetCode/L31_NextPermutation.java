package leetCode;

public class L31_NextPermutation {

    public static void main(String[] args) {

    }


}


class Solution31 {
    public void nextPermutation(int[] nums) {
        int i = nums.length-2;

        //go down until  decreasing sequence
        while(i >=0 && nums[i] >= nums[i+1]){
            i--;
        }
        // find the next number smaller than nums[i]
        if(i>=0){
            int j = nums.length-1;
            while(j>=0 && nums[j] <= nums[i]) j--;
            swap(nums, i ,j);
        }

        reverse(nums, i+1);

    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i]  = nums[j];
        nums[j] = temp;
    }

    // works only if it's sorted array
    public void reverse(int[]nums, int start){
        int end = nums.length-1;
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
}