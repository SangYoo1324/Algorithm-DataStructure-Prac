package sortingAlgorithm;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
            int[] arr= {1,3,2,4,5};

            bubble(arr,4);
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static void bubble(int[] arr,int lastIndex){
       // arr[0], arr[1] 비교하고 끝
        for(int i = 1; i<=lastIndex; i++){
            if(arr[i-1]>arr[i]){
                swap(arr,i-1,i);
            }
        }
        while(lastIndex < 0)
        bubble(arr, lastIndex-1);

    }

    public static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first]= arr[last];
        arr[last] = temp;

    }

}
