package CodingInterviewQuestions;

public class DeadlockScenario {
    public static void main(String[] args) throws InterruptedException {
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();

        Thread t1 = new Thread(new SyncThread(obj1,obj2),"t1");

    }


}
class SyncThread implements Runnable{
    private Object obj1;
    private Object obj2;

    public SyncThread(Object obj1, Object obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    @Override
    public void run() {

    }
}
