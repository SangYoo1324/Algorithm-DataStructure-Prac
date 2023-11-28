package CodingInterviewQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * The Main class implements an application that reads lines from the standard input
 * and prints them to the standard output.
 */
public class MinimumCoins {
    /**
     * Iterate through each line of input.
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        int one = 1;
        int three =3;
        int five = 5;
        int sum=0;
        int count=0;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
            int input = Integer.parseInt(line);
            while(sum<=input){
                if((sum+five)<=input){
                    sum+=five;
                    count++;
                }else if(sum+three<=input){
                    sum+=three;
                    count++;
                }else if(sum+one<=input){
                    sum+=one;
                    count++;
                }else{ break;}
            }
            System.out.println(sum);
            System.out.println(count);
        }
    }
}

