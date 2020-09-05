public class Ticket implements Runnable{
    private int ticket = 100;
    // 卖票
    @Override
    public void run(){
        // 窗口永远开启
        while (true){
            if (ticket>0){
                // 有票就可以卖，使用sleep模拟出票时间
                try{
                    Thread.sleep(100);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                // get this ThreadName
                String name = Thread.currentThread().getName();
                System.out.println(name+"正在卖票"+ticket--);
            }
            if (ticket == 0) break;
        }
    }
}
