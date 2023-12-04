package leetCode;

import java.util.ArrayList;
import java.util.List;

public class L39_CombinationSum {
    public static void main(String[] args) {
        Solution39 solution39 = new Solution39();

        solution39.combinationSum(new int[]{2,3,6,7}, 7).stream().forEach((e)->{
            System.out.print(e +" -> ");
        });
    }
}

class Solution39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> combinations = new ArrayList<>();
        List<Integer> current= new ArrayList<>();
        for(int i = 0; i< candidates.length; i++){
            System.out.println("starting Point: "+ candidates[i]);
            current.add(candidates[i]);

            recurse(candidates,i,target-candidates[i],current,combinations);
            current.remove(current.size()-1);
        }

        return combinations;
    }

    public void recurse(int[] candidates,int startingPoint, int remain, List<Integer> current,List<List<Integer>> combinations){
        // 나머지가 0 된 시점에서 current 리턴
        if(remain == 0) {
            System.out.println("나머지 0됨 재귀 종료");
            current.stream().forEach((e)->{
                System.out.print(e+",");
            });
            System.out.println();
            combinations.add(new ArrayList<>(current));
            return;
        }

        for(int i = startingPoint; i < candidates.length; i++){

            // 나머지가 아직 남았을 경우 재귀 계속
            if(remain>=candidates[i]){
                current.add(candidates[i]);
                System.out.println("나머지 아직 남음");
                current.stream().forEach((e)->{
                    System.out.print(e+",");
                });

                int remaining = remain-candidates[i];
                if(remaining ==0) startingPoint++;
                System.out.println();
                recurse(candidates,startingPoint,remaining,current,combinations);
                System.out.println("currentSize = "+ current.size());
                current.remove(current.size()-1);
            }

        }

    }

}

class Solution39_2 {
    List<List<Integer>> result = new ArrayList<List<Integer>>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        for (int i = 0, len = candidates.length; i < len; i++) {
            List<Integer> temp = new ArrayList<Integer>();
            temp.add(candidates[i]);
            backtracking(candidates, i, 1, target - candidates[i], temp);
        }

        return result;
    }

    public void backtracking(int[] candidates, int index, int tempSize, int target, List<Integer> temp) {
        if (target == 0) {
            result.add(new ArrayList(temp));

            return;
        }

        for (int i = index, len = candidates.length; i < len; i++) {
            if (candidates[i] <= target) {
                temp.add(candidates[i]);
                backtracking(candidates, i, tempSize + 1, target - candidates[i], temp);
                temp.remove(tempSize);
            }
        }
    }
}