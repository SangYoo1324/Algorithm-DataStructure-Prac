package leetCode;

public class RegBst {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int[] arr2  ={};
        System.out.println("shibal");
        System.out.println(solution(arr,1));

        System.out.println(solution_recursive(arr,3));
    }

    public static int solution(int[] nums, int target) {
//            if(nums.length == 0) return -1;
////1 2 3
//
//        int start = 0;
//        int end = nums.length-1;
//
//        while(start<=end){
//            int mid = (end-start)/2+start;
//
//            if(nums[mid] == target) return target;
//            else if(nums[mid]>target){
//                end = mid;
//
//            }else{
//                start = mid+1;
//            }
//
//        }
//
//        return -1;

    if(nums.length == 0) return -1;

    int start = 0;
    int end = nums.length-1;

    while(start<=end){
        int mid = (start+end)/2;

        if(nums[mid] == target) return 1;
        else if(nums[mid]>target) end = mid;
        else if(nums[mid]<target) start = mid+1;
    }


     // while문을 빠져나왔다는건 없다는거
        return -1;




    }

    public static int solution_recursive(int[] nums, int target){
        if(nums.length == 0) return -1;

        int start = 0;
        int end = nums.length-1;

        return recursive_bst(nums, start,end,target);


    }

    public static int recursive_bst(int [] nums, int start, int end, int target){
        int mid = (end-start)/2+start;
        if(start<end){
            if(nums[mid] == target){
                return target;
            }

            if(nums[mid]<target){
                recursive_bst(nums,mid+1,end,target);
            }
            else if(nums[start]>target){
                recursive_bst(nums,start,mid,target);
            }

        }
        return -1;
    }


}



