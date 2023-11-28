package sortingAlgorithm;

import java.util.Arrays;

public class BubbleSort2 {
    public static void main(String[] args) {
        int[] arr= {1,3,2,4,5};

        bubble2(arr,4);
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static void bubble2(int[] arr,int lastIndex){
        // 2개 남을 때까지 비교
        for(int i = 1; i<=lastIndex; i++){
            if(arr[i-1]>arr[i]){
                swap(arr,i-1,i);
                bubble2(arr,lastIndex-1);
            }
        }


    }

    public static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first]= arr[last];
        arr[last] = temp;
    }
}
