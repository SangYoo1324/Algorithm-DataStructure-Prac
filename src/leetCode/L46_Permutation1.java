package leetCode;

import java.util.ArrayList;
import java.util.List;

public class L46_Permutation1 {
    public static void main(String[] args) {
        Solution46 solution46 = new Solution46();
        solution46.permute(new int[]{1,2,3})
                .stream().forEach((e)->{
                    System.out.print("[");
                    e.stream().forEach((j)->{
                        System.out.print(j+",");
                    });
                    System.out.print("]");
                });

    }
}


class Solution46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtracking(nums, result,current);

        return result;
    }

    public void backtracking(int[] nums,List<List<Integer>> result,
                             List<Integer> current
                             ){
        // current Size가  nums사이즈하고 같다면 current를 넣고 종료
        if(current.size() == nums.length){
            System.out.println("다 찼음. 빠져나옵니다");
            result.add(new ArrayList<>(current));
        }else{
            for(int i = 0; i<nums.length; i++){
                System.out.println("nums[i] = "+ nums[i]);
                // current에 없는 것만 넣어줌
                if(!current.contains(nums[i])){
                    current.add(nums[i]);
                    backtracking(nums,result,current);
                    current.remove(current.size()-1);
                }
            }
        }


    }
}