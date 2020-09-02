// Runnable

public class RunnableDemo implements Runnable {
    private Thread t;
    private String threadName;

    // 构造方法
    RunnableDemo (String name){
        threadName = name;
        System.out.println("Creating" + threadName);
    }

    // run
    public void run(){
        System.out.println("Running "+ threadName);
        try{
            for (int i = 4;i > 0;i--){
                System.out.println("Thread:"+threadName +","+i);
                // 休眠线程
                Thread.sleep(2000);
            }
        }catch (InterruptedException e){
            System.out.println("Thread:"+threadName +" interrupted");
        }
        System.out.println("Thread:"+threadName +" exsiting.");
    }

    // start
    public void start(){
        System.out.println("Start " + threadName);
        if (t == null){
            t = new Thread(this,threadName);
            t.start();
        }
    }
}

// 测试
class TestThread02 {
    public static void main(String[] args) {
        // Thread-1
        RunnableDemo R1 = new RunnableDemo("Thread-1");
        R1.start();
        // Thread-2
        RunnableDemo R2 = new RunnableDemo("Thread-2");
        R2.start();
    }
}
