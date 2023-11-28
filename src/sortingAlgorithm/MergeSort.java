package sortingAlgorithm;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr  = {8,4,3,2,1,5,6,7,9,10};
        merge(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }

    public static void merge(int[] arr){
        int[] temp = new int[arr.length];
        merge(arr,temp,0,arr.length-1);
    }
    public static void merge(int[] arr,int[] temp,int firstIndex, int lastIndex){
          // 박스에 2 남을때까지만 진행
        if(firstIndex<lastIndex){
            int mid = (firstIndex+lastIndex)/2;
            // 배열 둘로 쪼갬(최하단은 4개짜리 를 2개로 쪼개는거) 오른 왼쪽
            merge(arr,temp, firstIndex,mid);
            merge(arr,temp,mid+1, lastIndex);
            //두개로 나눠진 블록 병합
            mergeBoxes(arr,temp,firstIndex,mid, lastIndex);


        }


    }

    private static void mergeBoxes(int[] arr, int[] temp, int firstIndex, int mid, int lastIndex) {
            //임시저장소에 받은 배열 다 복사
            for(int i = firstIndex; i<=lastIndex; i++){
                temp[i] = arr[i];
            }

            int part1Index = firstIndex;
            int part2Index = mid+1;
            int index = firstIndex;

            while(part1Index<=mid && part2Index<=lastIndex){
                if(temp[part1Index]>temp[part2Index]){
                    arr[index]= temp[part1Index];
                    index ++;
                    part1Index++;
                }else{
                    arr[index] = temp[part2Index];
                    index++;
                    part2Index++;
                }
            }

      // part1 마지막부분- part1 현재까지 진행한 만큼 = part1 이 몇개나 남았나 계산 가능
        // index++; 하고 갔으므로 index는 다음 지점까지 이미 도달 해 있는상태,
        //part1도 이미 ++ 됬으므로 다음거로 넘어가 있는 상태
        // 즉, i=0부터 시작해야 index가 1개 건너뛰고 시작하는거 방지할 수 있음
        for(int i = 0; i<=mid-part1Index; i++){
            arr[index+i] = temp[part1Index+i];
        }


    }
}
