package codility;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }
    //1 1 2 3 5 8 13

    //f2= f1 f0 = 2
    //f3= f1 f2 = 3
    public static int fibonacci(int n){
        if(n<=1){
            return 1;
    }else{
        return fibonacci(n)+fibonacci(n-1);}
    }
}
