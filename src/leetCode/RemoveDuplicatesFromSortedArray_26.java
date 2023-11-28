package leetCode;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray_26 {

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2}; // Input array
//        int[] expectedNums = [...]; // The expected answer with correct length

        Solution26 sol = new Solution26();
        int k = sol.removeDuplicates(nums); // Calls your implementation
    }

}

class Solution26 {
    public int removeDuplicates(int[] nums) {
        // nums 자체도 수정해야 한다

        int index = 1;

        for(int i = 0; i<nums.length-1; i++){
            if(nums[i]!= nums[i+1]){
                nums[index] = nums[i+1];
            }
        }
            return index;
    }
}