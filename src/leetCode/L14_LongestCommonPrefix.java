package leetCode;

public class L14_LongestCommonPrefix {
    public static void main(String[] args) {
       String[] strs = {"abab","aba",""};
       //"abab","aba",""
        //"cir","car"
        //"c","acc","ccc"
        //"flower","flow","flight"
       Solution14 solution14 = new Solution14();

        System.out.println(solution14.longestCommonPrefix2(strs));
    }
}

class Solution14 {
    public String longestCommonPrefix2(String[] strs){
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        for(String s: strs){
            while(s.indexOf(prefix) != 0){  // 첫째루프는 같은 문자열 비교니까 바로 true 뜸
                // prefix가 일치하지 않을 때마다 prefix를 한개씩 줄여줌
                prefix = s.substring(0, prefix.length()-1);
            }
            // 아얘 일치하지 않는경우에는 "" 가 리턴됨
        }
        return prefix;
    }

    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();
        if(strs.length ==1) return strs[0];

        int charidx = 0;
        int minLengthIdx = strs[0].length();
        while(charidx<minLengthIdx){
//            if(minLengthIdx ==0){
//                return "";
//            }
            boolean isMatching = true;
            for(int i = 1; i<strs.length; i++){
                if(strs[i].length()!=0 &&strs[0].charAt(charidx) == strs[i].charAt(charidx)){
                    System.out.println("일치합니다: "+ strs[i].charAt(charidx));
                }else{
                    System.out.println("불일치합니다");
                   isMatching = false;
                }
                minLengthIdx = Math.min(minLengthIdx,strs[i].length());
            }
            if(isMatching){
                prefix.append(strs[0].charAt(charidx));
            }else{
                return prefix.toString();
            }
                charidx++;
        }
        return prefix.toString();
    }
}