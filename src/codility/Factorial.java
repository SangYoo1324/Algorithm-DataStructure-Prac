package codility;

public class Factorial {
    public static void main(String[] args) {

    }
    public static int factorial(int n){
        if(n==1) //종료지점
            return 1;
        else return (n*factorial(n-1));
    }

}
