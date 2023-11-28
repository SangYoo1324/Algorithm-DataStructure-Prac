package sortingAlgorithm;

import static sortingAlgorithm.BubbleSort.swap;

public class SelectionSort2 {
    private static void selectionSort2(int[] arr){
        selectionSort2(arr,0);
    }
    private static void selectionSort2(int[] arr, int start){
        //start가 끝이랑 같기 전, 즉 비교대상이 1개 이상인 총 2개 이상일때까지만 진행
        int min_index = start;
        for(int i= start ; i<=arr.length-1; i++) {
            // array 돌면서 가장 작은 값의 index 계속 업데이트
            if(arr[i]<arr[min_index]) min_index = i;
        }
            // min index에 있는 값을 맨 앞에 위치시킴
            swap(arr,start,min_index);
            // 맨앞 정렬된 1개 빼고 다시 재귀
            selectionSort2(arr,start+1);

    }

    public static void main(String[] args) {
        int[]arr= {3,6,1,8,2,4};
        for(int data : arr){
            System.out.print(data+",");
        }
        System.out.println();
        selectionSort2(arr,0);
        for(int data : arr){
            System.out.print(data+",");
        }
    }
}
