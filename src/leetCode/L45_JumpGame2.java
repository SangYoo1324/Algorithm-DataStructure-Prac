package leetCode;

public class L45_JumpGame2 {

    public static void main(String[] args) {
        Solution45 solution45 = new Solution45();

        System.out.println(solution45.jump(new int[]{3,1,1,1,1}));
    }
}

//It's guaranteed that you can reach nums[n - 1].
// 이 뜻은... 이 이상 넘어가는것도 말고 정확히 끝 부분에 도착하는게 보장 되어 있다는것
class Solution45 {
    public int jump(int[] nums) {

        int count = 0;
        int currReach = 0;
        int farthest = 0;
        for(int i = 0; i<nums.length-1; i++){
            System.out.println("i= "+i);
            farthest = Math.max(farthest,i+ nums[i]) ;
            // 현재 도달 가능한 위치를 i가 넘기면 current를 farthest로 업데이트
            // farthest를 가기 위해서는 점프가 필요해지므로 점프 ++
            if(currReach == i){
                currReach = farthest;
                count++;
            }


        }


        return count;
    }
}