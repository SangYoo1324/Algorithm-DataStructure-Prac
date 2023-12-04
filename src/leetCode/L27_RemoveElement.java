package leetCode;

import java.util.Arrays;

public class L27_RemoveElement {
    public static void main(String[] args) {
        Solution27 solution27 = new Solution27();
        //0,1,2,2,3,0,4,2
        int[] input = new int[]{3,2,2,3};
            solution27.removeElement(input, 3);

        Arrays.stream(input).forEach((e)->{
            System.out.println(e);
        });


    }


}

class Solution27 {
    public int removeElement(int[] nums, int val) {
        if(nums.length ==0){
            return 0;
        }

        int index = 0;

        for(int i = 0; i< nums.length; i++){
            System.out.println("i = "+ i);
            if(nums[i] != val){
                nums[index] = nums[i];
                index++;
            }
        }


        System.out.println("-------------------------");
        System.out.println("final index = "+ index);
        return index;
    }
}