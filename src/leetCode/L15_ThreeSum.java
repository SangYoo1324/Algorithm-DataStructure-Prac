package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
//-4,-1,-1,0,1,2
//-1,-1,0,1
//-2,0,1,1,2
public class L15_ThreeSum {
    public static void main(String[] args) {
        Solution15 solution15 = new Solution15();
        solution15.threeSum(new int[]{0,0,0,0}).stream().forEach((e)->{
            e.stream().forEach(p->{
                System.out.print(p);
            });
            System.out.print(", ");
        });
    }
}

// {-2,-2,1,2,3,3}
class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        //정렬 후  맨 끝이 음수이면 절대 0을 만들 수 없으므로 0 리턴
        if (nums[nums.length - 1] < 0) return new LinkedList<>();
        List<List<Integer>> triplets = new LinkedList<>();
        for(int i = 0; i<nums.length-2; i++){
            System.out.println("i:::: "+ i);
            // ex{-1,-1,0,1,2} 에서 -1이 두번 돌면서  -1,0,1이 두번 나오므로 바로 전 i가 나온 경우 스킵 가능하게 해줘야 함
            if(i ==0 || (i>0 && nums[i] != nums[i-1])){
                int lowIdx = i+1;
                int highIdx = nums.length-1;
                int sum = 0 - nums[i];

                while(lowIdx<highIdx){
                    List<Integer> triplet = new ArrayList<>();
                    if(nums[lowIdx] + nums[highIdx] == sum) {
                        triplet.add(nums[lowIdx]);
                        triplet.add(nums[highIdx]);
                        triplet.add(nums[i]);
                        triplets.add(triplet);
                        // 중복 건너뛰는프로세스
                        while(lowIdx <highIdx && nums[lowIdx] == nums[lowIdx+1]){
                            lowIdx++;
                        }
                        // 중복 건너뛰는 프로세스
                        while(lowIdx < highIdx && nums[highIdx] == nums[highIdx - 1]){
                            highIdx--;
                        }
                        // 중복 다 건너뛰엇으면 lowIdx만 움직여줌
                        lowIdx++;

                    }
                    else if((nums[lowIdx]+nums[highIdx])>sum){
                        highIdx--;
                    }
                    else{
                        lowIdx++;
                    }

                }
            }
        }



        return triplets;
        }
    }


