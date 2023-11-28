package leetCode;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        Solution11 solution11 = new Solution11();
        System.out.println(    solution11.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));

    }
}

class Solution11 {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length-1;

        while(left<right){
            int width = (right-left) * Math.min(height[left],height[right]);
            // update maxArea
            maxArea = Math.max(maxArea, width);
            // adjust left or right
            if(height[left]<height[right]){
                left++;
            }else{
                right++;
            }
        }


        return maxArea;
    }
}