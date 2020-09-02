/**
 * @author davis
 * @version 1.0
 */
// Thread
public class ThreadDemo extends Thread {
    private Thread t;
    private String threadName;

    // 构造方法
    ThreadDemo (String name){
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
                Thread.sleep(5000);
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
class TestThread {
    public static void main(String[] args) {
        // Thread-1
        ThreadDemo T1 = new ThreadDemo("Thread-1");
        T1.start();
        // Thread-2
        ThreadDemo T2 = new ThreadDemo("Thread-2");
        T2.start();
    }
}

