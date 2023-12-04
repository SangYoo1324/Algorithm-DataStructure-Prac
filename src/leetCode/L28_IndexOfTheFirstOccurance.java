package leetCode;

public class L28_IndexOfTheFirstOccurance {
    public static void main(String[] args) {
        Solution28 solution28 = new Solution28();

        System.out.println(solution28.strStr("mississippi", "issipi"));
    }
}


class Solution28 {
    public int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length()) return -1;
        for(int i = 0; i<haystack.length(); i++){
            System.out.println("i= "+ i);
            if(haystack.charAt(i) == needle.charAt(0)){
                boolean occured = true;
                for(int j = 0; j<needle.length(); j++){
                    System.out.println("occured");
                    if((i+j)<haystack.length() &&haystack.charAt(i+j) == needle.charAt(j)){
                        System.out.println("j = "+ j);
                        continue;
                    }
                    else{
                        System.out.println("not occured");
                        occured = false;
                        break;
                    }
                }
                if(occured){
                    return i;
                }
            }
        }

        return -1;
    }
}