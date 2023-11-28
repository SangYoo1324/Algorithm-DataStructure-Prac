package leetCode;

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        Solution16 solution16 = new Solution16();
//        System.out.println(solution16.threeSumClosest(new int[]{-4,-1,1,2}, 1));
        System.out.println(solution16.threeSumClosest(new int[]{0,0,0}, 1));
    }
}

//-4,-1,1,2
class Solution16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int minDistToTarget = 100000;
        int current =0;
        int minValue = 0;
        for(int i = 0; i<nums.length-2; i++){
            System.out.println("i = "+ i);

            int lowIdx = i+1;
            int highIdx = nums.length-1;

            while(lowIdx<highIdx){
                current = nums[lowIdx]+nums[highIdx]+nums[i];
                int currentHowClose = Math.abs(target-current);
                System.out.println("currentHowClose = "+currentHowClose);
                if(current == target) return target;
                else if(current>target && highIdx>lowIdx){
                    System.out.println("current>target");
                    if(minDistToTarget>currentHowClose){
                        minDistToTarget = currentHowClose;
                        minValue = current;
                    }
                    highIdx--;
                }
                else if(current<target && highIdx >lowIdx){
                    System.out.println("current<target");
                    if(minDistToTarget>currentHowClose){
                        minDistToTarget = currentHowClose;
                        minValue = current;
                    }

                    lowIdx++;
                }
                else{
                    System.out.println("else");
                    if(minDistToTarget>currentHowClose){

                        minDistToTarget = currentHowClose;
                        minValue= current;
                    }
                    break;}

            }
        }


        return minValue;
    }
}