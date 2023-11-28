package codility;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        System.out.println(solution(100,123));
    }
    public static int solution(int A, int B) {
        int normal = A*B;
        String binary = "";
        for(int i = (1<<30); i>0; i= i/2){
            binary += (normal&i)!=0? "1":"0";

        }

        int count = 0;
       char[] binaryArr=  binary.toCharArray();
    for(char c : binaryArr){
        if(c=='1')
            count++;
    }
    return count;
    }
}
