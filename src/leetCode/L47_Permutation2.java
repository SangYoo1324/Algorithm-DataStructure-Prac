package leetCode;

import java.util.ArrayList;
import java.util.List;

public class L47_Permutation2 {
    public static void main(String[] args) {

    }
}

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        backTracking(nums,current,result);

    }

    public void backTracking(int[] nums,  List<Integer> current, List<List<Integer>> result){

        // 모든 요소가 들어갔다면, return
        if(current.size() == nums.length){
            result.add(new ArrayList<>(current));

        }else{

        }



    }
}