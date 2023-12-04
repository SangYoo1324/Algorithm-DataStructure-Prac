package leetCode;

public class L38_CountAndSay {
}

class Solution38 {
    public String countAndSay(int n) {
        // n = 1 일때 "1" 반환
        String res = "1";

        for(int i = 1; i<n ;i++){
            // 결과값을 다음에 다시 사용한다(for재귀)
            res = say(res);
        }
        return res;
    }

    private String say(String s){
        String res = "";
        int p1 = 0;
        int p2 = 0;

        while(p2<s.length()){
            if(s.charAt(p1) !=s.charAt(p2)){
                res += (p2-p1)+""+ s.charAt(p1);
                p1 = p2;
            }
            p2++;
        }

        //맨 마지막은 s.charAt(p1) != s.charAt(p2)가 발동이 안됨
        // 다음 다른 char이 안나오니까
        res +=(p2-p1)+""+s.charAt(p1);

        return res;
    }
}