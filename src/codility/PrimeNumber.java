package codility;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(4));
    }
    public static boolean isPrime(int n){
        if(n==0 || n==1) return false;
        if(n==2)return true;
        else{
            for(int i = 2; i<=n/2; i++){
                if(n%i==0){
                    return false;
                }

            }
            return true;
        }
    }
}
