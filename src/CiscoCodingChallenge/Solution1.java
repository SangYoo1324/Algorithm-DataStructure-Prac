package CiscoCodingChallenge;


import java.util.*;
import java.lang.*;

/*
 * inputArr, represents the list containing N elements.
 */
public class Solution1
{
    public static void  funcMeanMode(int[] inputArr)
    {
        Map<Integer, Integer> tempBin  = new HashMap<Integer,Integer>();
        int sum = 0;
        int count = 0;
        // Write your code here
        for(int i: inputArr){
            sum+=i;
//            System.out.println(tempBin.get(i));

            if(tempBin.get(i)==null)
                tempBin.put(i,1);
                else{
                count = tempBin.get(i);
                tempBin.put(i,++count);
            }


        }


        Iterator<Map.Entry<Integer,Integer>> entries = tempBin.entrySet().iterator();
        int frequency=0;
        int key = 0;
        while(entries.hasNext()){
            Map.Entry<Integer,Integer> entry = entries.next();
            int temp = entry.getValue();
            if(temp>frequency){
                frequency=temp;
                key= entry.getKey();
            }

//            System.out.println( "[key]: "+entry.getKey()+ " [value]: "+entry.getValue());
        }
//        System.out.println("Most Frequent #:  "+key);
//        System.out.println("How many times ?:    "+frequency);

//        System.out.println("Sum:  "+sum);
        int mean = (int) Math.floor(sum/inputArr.length);
//        System.out.println("Mean:  " + mean);

        System.out.println(mean+" "+key);



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


        funcMeanMode(inputArr);
    }
}


