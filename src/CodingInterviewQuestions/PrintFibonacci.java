package CodingInterviewQuestions;

public class PrintFibonacci {
    public static void main(String[] args) {
        for(int i =0; i<10; i++){
            System.out.println(printFibonacciRec(i));
        }
    }


    private static int printFibonacciRec(int count) {
//        if(count<0) return 0;
        if(count <=1)
            return count;
        else
            return printFibonacciRec(count-1)+ printFibonacciRec(count-2);

    }



}
