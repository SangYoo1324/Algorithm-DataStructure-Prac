package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        System.out.println(" 결과값::"+
                solution4.findMedianSortedArrays(new int[]{1,3},new int[]{2,7})
                );
    }


}

class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int total_length = nums1.length +nums2.length;
        int num1Pointer = 0;
        int num2Pointer = 0;
        int mergedPointer= 0;
        System.out.println(total_length);
        int[] merged = new int[total_length];
        // 정렬하며 집어넣음
        while(num1Pointer <nums1.length && num2Pointer<nums2.length){
            if(nums1[num1Pointer]<nums2[num2Pointer]){
                System.out.println("nums1이 더 큼: "+ nums1[num1Pointer]);
               merged[mergedPointer]  = nums1[num1Pointer];
               num1Pointer++;
               mergedPointer++;
            }else{
                System.out.println("nums2이 더 큼: "+ nums2[num2Pointer]);
                merged[mergedPointer] = nums2[num2Pointer];
                num2Pointer++;
                mergedPointer++;
            }
        }

         while(num1Pointer <nums1.length){
             merged[mergedPointer] = nums1[num1Pointer];
             mergedPointer++;
             num1Pointer ++;

        }
         while(num2Pointer<nums2.length){
             merged[mergedPointer] = nums2[num2Pointer];
             mergedPointer++;
             num2Pointer ++;
        }

        Arrays.stream(merged).forEach((e)->{
            System.out.print(e+", ");
        });

        // 홀수인경우 n/2 번째가 median
        if(total_length%2 == 1){
            int medianIndex = total_length/2;
            return merged[medianIndex];
        }
        // 짝수인 경우 n/2-1 n/2의 중간값이 median
            else{
                int leftMedian = total_length/2;
                int rightMedian = total_length/2-1;
            System.out.println();
            System.out.println(merged[rightMedian]+merged[leftMedian]);
//            System.out.println(leftMedian);
//            System.out.println(rightMedian);
            return ((double)(merged[leftMedian] + merged[rightMedian]) / 2);
        }

    }


}
