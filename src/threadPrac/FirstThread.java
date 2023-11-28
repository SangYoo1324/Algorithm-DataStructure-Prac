package threadPrac;

public class FirstThread {
    public static void main(String[] args) {
        // Thread 상속한 클래스의 run() 실행법
        MyThread_Thread thread = new MyThread_Thread();
        thread.start();
    // Runnable 인터페이스 클래스의 run() 실행법
        //runnable 객체 생성 후
        //Thread에 runnable 객체 넣고 시작
        Runnable r = new MyThread_runnable();
        Thread thread_runnable = new Thread(r);
        thread_runnable.start();


    }
    // setTimeout function을 java로
    public static void setTimeout(Runnable runnable, int timeout){
        Thread thread = new Thread(()->{
            try{
                Thread.sleep(timeout);
                runnable.run();
            }catch(Exception e){
                e.printStackTrace();
            }
        });
        thread.start();
    };
}

class MyThread_Thread extends Thread{
    public void run(){
        System.out.println("with extends Thread");
    };
}

class MyThread_runnable implements Runnable{
    public void run(){
        System.out.println("with runnable Interface");
    }

}

