package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum_18 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,2,2,2,2};
        Solution18 solution18 = new Solution18();

        solution18.fourSum(nums,8)
                .stream().forEach(e->{
            System.out.println("finalSet");
            e.stream().forEach(k->{
                System.out.print(","+k.toString());
            });
        });
    }
}


class Solution18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);

        List<List<Integer>> resSet = new ArrayList<>();
        List<Integer> res= new ArrayList<>();

        // i, j는 for loop에서 고정, k,l만 움직임
        for(int i = 0; i<nums.length-3; i++){
            for(int j = i+1; j<nums.length-2; j++){
                int k = j+1;
                int l = nums.length-1;

                while(k<l){
                    int sum = nums[i]+nums[j]+nums[k]+nums[l];
                    if( sum == target){
                        res.add(nums[i]);
                        res.add(nums[j]);
                        res.add(nums[k]);
                        res.add(nums[l]);
                        resSet.add(cloning(res));
                        res.clear();
                        System.out.println(nums.length);
                        while(nums[k] == nums[k+1] && k<nums.length-2) {
                            System.out.println("k = "+k);
                            k++;}
                        while(nums[l] == nums[l-1] && l>k){
                            System.out.println("l= "+l);
                            l--;
                        }
                        k++;
                        l--;

                    }
                    else if(sum<target){
                        k++;
                    }
                    else{
                        l--;
                    }
                }

                while(nums[j] == nums[j+1] && j< nums.length-2 ) j++;

            }
            while(nums[i] == nums[i+1] && i< nums.length-3) i++;
        }

        resSet.stream().forEach(e->{
            System.out.println("finalSet");
            e.stream().forEach(k->{
                System.out.print(","+k.toString());
            });
        });

        return resSet;
    }
    public List<Integer> cloning(List<Integer> target){
        List<Integer> clone = new ArrayList<>();
        target.stream().forEach(e->{
            clone.add(e);
        });
        return clone;
    }
}
