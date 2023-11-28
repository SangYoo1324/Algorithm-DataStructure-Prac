package threadPrac;

import javax.swing.*;

public class SingleMultiThread {
    public static void main(String[] args) {


        String input = JOptionPane.showInputDialog("Random number Input. ");
        int [] a = {1,2,3,4,5};

        //Single Thread
//        System.out.printf("your input %s desu",input);
//        for(int i : a){
//            System.out.println(i);
//            try{
//                Thread.sleep(1000);
//            }catch(Exception e){
//                e.printStackTrace();
//            }
//        }

        //multi Thread
        Thread t = new Thread(()->{
            for(int i : a){
                System.out.println(i);
                try{
              Thread.sleep(1000);
           }catch(Exception e){
              e.printStackTrace();
          }
            }
        });
        t.start();

        String input2 = JOptionPane.showInputDialog("Random number Input. ");
        System.out.printf("your input %s desu",input2);

    };
}
