package Extra;

public class Main {
    public static void main(String[] args) {

  for(int i =1; i<=40 ;i++){
      System.out.print("-");
        }
        System.out.println();
  for(int i=4; i<=40; i+=4){
      System.out.print("_-^-");
  }
  for(int i=1; i<=20; i++){
      System.out.print(i);
  }
    }

    public static int fibbonacci(int num){
            if(num<=2) return 1;

            else
                return fibbonacci(num-2)+ fibbonacci(num-1);
    }

    public static int factorial(int num){
            if(num==1) return 1;

            else
                return num*factorial(num-1);
    }
}
