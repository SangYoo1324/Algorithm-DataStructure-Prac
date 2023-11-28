package CiscoCodingChallenge;

import java.util.*;
import java.lang.*;
import java.io.*;

/*
 * numJars, represents the number of jars.
Value of the array represents the number of chocolates in each jar.
 */
public class Solution
{
    public static void  maxSum(int[] inputArr)
    {
        // Write your code here
        //odd case
        int oddCaseSum = 0;
        for(int i = 1; i<inputArr.length; i+=2){
            oddCaseSum+=inputArr[i];
        }
        //even case
        int evenCaseSum = 0;
        for(int i = 0; i<inputArr.length; i+=2){
            evenCaseSum+= inputArr[i];
        }

        System.out.println(Math.max(evenCaseSum,oddCaseSum));
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //input for inputArr
        int inputArr_size = in.nextInt();
        int inputArr[] = new int[inputArr_size];
        for(int idx = 0; idx < inputArr_size; idx++)
        {
            inputArr[idx] = in.nextInt();
        }


        maxSum(inputArr);
    }
}