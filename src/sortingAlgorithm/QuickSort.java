package sortingAlgorithm;

import java.util.Arrays;

public class QuickSort {



    public static void main(String[] args) {
        int[] arr= {3,1,4,5,2};
        quick(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void quick(int[] arr){
        quick(arr,0,arr.length-1);
    }

    private static void quick(int[] arr, int start, int end){
        int part2 = partition(arr,start,end);  // partition 나눈 후 오른쪽 start값 리턴
        if(start< part2-1){  // 오른쪽 start 랑 원래 start랑 1개 초과. 차이가 날때만 recurse(target/leftend/rightstart )
            quick(arr,start,part2-1);// 왼쪽 파티션 recurse
        }
        if(part2<end){
            quick(arr,part2,end);
        }

        //  recurse 종료
    }

    private static int partition(int[] arr,int start, int end){
        int pivot = arr[(start+end)/2];
        while(start<end){// 시작보다 end가 클 동안만
        while(arr[start]<pivot) start++;
        while(arr[end]>pivot) end--;
//        if(start<=end){ // 아직 start end가 cross 햇는지 확인
            swap(arr,start,end);
            start++;
            end--;
        //}
        }
        return start;
    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start]= arr[end];
        arr[end] = temp;
    }
}
