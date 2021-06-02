public class ThreadDemo {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.start();
    }
}

class Demo extends Thread {

    @Override
    public void run() {
        System.out.println("Thread running...");
    }
}
