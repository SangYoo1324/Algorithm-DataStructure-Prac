package leetCode;

import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] test =
//                {3,2,4};
//                {2,7,11,15};
                {3,3};
//        for(int i = 0; i<solution.twoSum(test,6).length; i++){
//            System.out.println(i+",");
//        }
        System.out.println(solution.twoSum(test,6));

    }


}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> numsMap = new HashMap<>();
        for(int i = 0 ; i<nums.length; i++){

            if(numsMap.containsKey(target-nums[i])){
                return new int[]{i, numsMap.get(target-nums[i])};
            }


            // key: value of the array , value: indext of the array
            numsMap.put(nums[i],i);
        }
        return new int[]{};
    }
}