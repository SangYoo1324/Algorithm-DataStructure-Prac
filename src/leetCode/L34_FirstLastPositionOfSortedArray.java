package leetCode;

import java.util.Arrays;

public class L34_FirstLastPositionOfSortedArray {

    public static void main(String[] args) {
        int[] arr = new int[]{2,2};
        Solution34 solution34 =  new Solution34();

        Arrays.stream(solution34.searchRange(arr,2)).forEach(
                (e)->{
                    System.out.print(e +", ");
                }
        );


    }
}

class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        int left= 0;
        int right= nums.length-1;
        if(nums.length ==1) {
            if(nums[0] == target) return new int[]{0,0};
            else return new int[]{-1,-1};
        }
        while(left<=right){
            int mid = (left+right)/2;
            System.out.println("mid = "+ mid);
            if(nums[mid] == target){
                int i = mid;
                int j = mid;
                boolean iIsVeryStart = false;
                boolean jIsVeryEnd = false;
                while(nums[i] == target){
                    i--;
                if(i<0) break;
                }
                while(nums[j]== target){
                    j++;
                    if(j>nums.length-1) break;}
                System.out.println("i = "+i);
                System.out.println("j = "+ j);
                 i++;
                 j--;

                return new int[]{i,j};
            }
            else if(nums[mid]>target){
                System.out.println("nums[mid] 가  target보다 커서 왼쪽을 탐색");
                right = mid-1;
                System.out.println("left = "+ left);
                System.out.println("right= "+ right);
            }
            else{
                System.out.println("nums[mid] 가  target보다 작아서 오른쪽을 탐색");
                left = mid+1;
                System.out.println("left = "+ left);
                System.out.println("right= "+ right);
            }
        }
        return new int[]{-1,-1};
    }
}
