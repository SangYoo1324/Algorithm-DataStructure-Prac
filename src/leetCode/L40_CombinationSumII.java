package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L_40CombinationSumII {
    public static void main(String[] args) {

        Solution40 solution40 = new Solution40();
        solution40.combinationSum2(new int[]{2,5,2,1,2},5).stream().forEach(e->{
            System.out.println();
            System.out.print("::::");
            e.stream().forEach((d)->{
                System.out.print(d+", ");
            });

                });

    }

}

class Solution40 {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
            List<Integer> current = new ArrayList<>();
            recurse(candidates,0,target, current);

        return result;
    }

    public void recurse(int[] candidates, int startingPoint, int remaining, List<Integer> current){
        if(remaining == 0){
            result.add(new ArrayList<>(current));
        }else if(remaining>0){
            for(int i = startingPoint; i<candidates.length; i++){
                if (i > startingPoint && candidates[i] == candidates[i - 1]) {
                    System.out.println("같은 값이 걸렸습니다 스킵합니다");
                    break;
                }else{
                    current.add(candidates[i]);
                    recurse(candidates,startingPoint+1, remaining-candidates[i],current);
                    current.remove(current.size()-1);
                }

            }
        }

    }
}
