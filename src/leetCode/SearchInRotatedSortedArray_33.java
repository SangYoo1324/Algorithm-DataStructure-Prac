package leetCode;

import com.sun.security.jgss.GSSUtil;

public class SearchInRotatedSortedArray_33 {
    public static void main(String[] args) {
        Solution33 solution33 = new Solution33();
        int[]  nums = new int[]{4,5,6,7,0,1,2};
        System.out.println(solution33.search(nums, 0));

    }



}

class Solution33 {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int midIdx = (start+end)/2;
            if(nums[midIdx] == target) return midIdx;
                // 하필 mid가 pivot값으로 그 다음 값이 더 작을때
            else if(midIdx != nums.length-1 && nums[midIdx+1] <nums[midIdx]){
                System.out.println("pivot 경계");
                if(start<target && nums[midIdx]>target){
                    System.out.println("찾는 값이 pivot기준점 왼쪽에 있을 때");
                    end = midIdx;
                }else{
                    System.out.println("start가 target보다 작아서 ");
                    start = midIdx+1;
                }

            }else{
                if(nums[midIdx] <target){
                    System.out.println("타겟이 mid 보다 커서 오른쪽 탐색");
                    System.out.println("midIdx = "+ midIdx);
                    start = midIdx+1;
                }else{
                    System.out.println("타겟이 mid 보다 작아서 왼쪽 탐색");
                    System.out.println("midIdx = "+ midIdx);
                    end = midIdx;
                }
            }
        }

        return -1;
    }


    public int search2(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        // pivot 을 찾는 과정 : pivot은 left가 될 예정
        while(left<right){
            int midPoint = left + (right-left)/2;

            if(nums[midPoint]>nums[right]){
                left = midPoint+1;
            }else{
                right = midPoint;
            }
        }

        int start = left;
        left = 0;
        right = nums.length-1;

        if(target>= nums[start] && target <=nums[right]){
            left = start;
        }else{
            right = start;
        }

        while(left<=right){
            int midPoint = left+ (right-left)/2;
            if(nums[midPoint] == target) {
                return midPoint;
            }
            else if(nums[midPoint]<target){
                left = midPoint+1;
            }else{
                right = midPoint;
            }
        }

        return -1;
    }

    public int search3(int[] nums, int target) {

        int left = 0;
        int right = nums.length-1;

        while(left<=right){
            int mid = (left+ right)/2;

            if(nums[mid] == target) return mid;
            // mid가 left보다 큰 경우 왼쪽은 정렬이 된거다
            else if(nums[mid]>nums[left]){
                // 왼쪽 정렬된 곳 탐색 시작(타겟이 범위 안이라면 범위 좁히기 시작)
                if(target<nums[mid] && target>=nums[left]){
                    right = mid;
                }
                //target이 mid보다 큰 경우 탐색을 오른쪽으로 옮긴다
                else{
                    left = mid +1;
                }
            }
            // mid가 left보다 작은 경우 왼쪽은 정렬이 안됬으므로 오른쪽은 정렬이 된거다
            else{
                // 오른쪽 정렬된 곳 탐색 시작
                if(target>nums[mid] && target<=nums[right]){
                    left = mid;
                }
                // target이 mid보다 작은 경우 왼쪽으로 탐색을 옮긴다
                else{
                    right = mid-1;
                }

            }

        }

        return -1;

    }

}

//[5,6,7,8,9,1,2,3,4]    target =6
// temp = b(0, 2)
// temp = b(4,6)
//[8,9,1,2,3,4,5,6,7]