package codility;

public class SwapVar {
    public static void main(String[] args) {

    }
    public static void swapNumbers(int a, int b) {//swap value of a and b
        b = a+b;
        a= b-a; //a+b -a = b
        b= b-a;// a+b-b(a)



    }

    public static boolean vowelFalse(String input){
    return input.toLowerCase().matches(".*[aeiou]*");
    }
}
