package sortingAlgorithm;

public class MergeSort2 {
    public static void main(String[] args) {
        int[] arr  = {8,4,3,2,1,5,6,7,9,10};
        merge(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }

    public static void merge(int[] arr){
        int[] temp = new int[arr.length];
        recurseMerge(arr,temp,0,arr.length-1);
    }
    // 재귀 후 정렬
    public static void recurseMerge(int[] arr,int[] temp,int start, int end){

        // 맨 밑 2개 페어인 박스까지 recurse 쭉 내려갔다가
        if(start<end){
            int mid = (start+end)/2;
            recurseMerge(arr, temp, start, mid);
            recurseMerge(arr,temp,mid+1,end);
            //두개로 나눠진 블록 병합
            mergeBoxes(arr,temp,start,mid,end);
        }

        }

    private static void mergeBoxes(int[] arr, int[] temp, int start, int mid, int end) {
        //일단 받은 배열 복사                 part1|part2
        for(int i  = 0; i<=end; i++){
            temp[i] = arr[i];
        }
        // 임시 어레이에서의 왼쪽 인덱스
        int leftIndex = start;
        // 임시 어레이에서의 오른쪽 인덱스
        int rightIndex = mid+1;
         // 병합될 실제 어레이에서의 인덱스
        int index = start;
        //part1 part2 중 한 파트라도 모두 순회하면 종료
        while(leftIndex<=mid && rightIndex<=end){
            if(temp[leftIndex]>temp[rightIndex]){
                arr[index] = temp[rightIndex];
                index ++;
                rightIndex++;
            }
            else{
                arr[index] = temp[leftIndex];
                index++;
                leftIndex++;
            }
        }

        // box1에서 나머지 발생했을 경우 대비 box1 남은거 마지막에 append 해주기 (0 1, 0 1 2 등)
        for(int i = 0; i<=mid-leftIndex; i++){
            // 1개남았으면 이미 1칸 이동된 index만, 2개남았으면 1칸이동된 idex + 1
            arr[index+i] = temp[leftIndex+i];
        }

}

}
