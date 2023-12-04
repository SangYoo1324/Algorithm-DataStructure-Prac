package leetCode;

import java.util.*;

public class L3_LongestSubstring {
    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        //bpfbhmipx, abccde, abc
        System.out.println(solution3.lengthOfLongestSubstring("dvdf"));
//        System.out.println(solution3.lengthOfLongestSubstring("dvdfd"));// hashSet으로 만들어야하느 이유
//        System.out.println(solution3.lengthOfLongestSubstring("pwwkew"));

    }
}

class Solution3 {
    public int lengthOfLongestSubstring(String str) {
        if(str.length()==0||str== null)
            return 0;
        Set set=new HashSet();
        int j=0,max=0;
        for(int i=0;i<str.length();i++){
            // 중복이 발생했을 때 발동해서 중복 발생안할때까지 쭉 j=0부터 지워줌
            while(!set.add(str.charAt(i))) {
                set.remove(str.charAt(j++));
            }
                max=Math.max(max,i-j+1);


        }
        return max;

    }
}

