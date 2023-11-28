package sortingAlgorithm;

import java.util.Arrays;

import static sortingAlgorithm.BubbleSort.swap;

public class QuickSort2 {

    public static void main(String[] args) {
        int[] arr= {8,7,3,1,10,4,5,6,9,2};
        int[] arr2= {3,4,2,9,5,8,1,0,7,6};
        quick(arr2);
        Arrays.stream(arr2).forEach(System.out::println);
    }

    private static void quick(int[] arr){
        quick(arr,0, arr.length-1);

    }
    // 정렬 후 재귀
    private static void quick(int[] arr,int start, int end){

        int firstRight = partition(arr, start, end);

        // 비교군이 2개 이상일때만
        if(start<firstRight-1){
            quick(arr,start, firstRight-1);
        }
        if(firstRight<end){
            quick(arr,firstRight,end);
        }


    }
        // 5 1 2 3 4
    private static int partition(int[] arr, int start, int end){

        int pivot = arr[(start+end)/2];

        while(start<end){
            while(arr[start]<pivot) start++;
            while(arr[end]>pivot) end--;
            if(start<=end){
                swap(arr,start,end);
                start++;
                end--;
            }
        }


        return start;








    }

    private static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

    }
}
