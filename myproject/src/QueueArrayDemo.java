// 顺序队列实现
public class QueueArrayDemo {
    private Object[] data;
    private int front; //队列头部
    private int rear; // 队列尾部
    private int size;

    public QueueArrayDemo(int size){
        this.size = size;
        data = new Object[size];
    }

    // enqueue
    public void enQueue(Object value) throws Exception{
        if (rear == size){
            throw new Exception("queue is full now");
        }
        data[rear++] = value;
    }

    // dequeue
    public Object deQueue()throws Exception{
        if (isEmpty()){
            throw new Exception("empty queue exception");
        }
        Object value = data[front];
        data[front++] = null;
        return value;
    }

    // isEmpty
    public boolean isEmpty(){
        return front == rear;
    }

    // 遍历
    public void traverse(){
        for(int i=front;i<rear;i++){
            System.out.println(""+data[i]);
        }
    }

    // isFull

    // main
    public static void main(String[] args) {
        QueueArrayDemo queue = new QueueArrayDemo(5);
//        queue.enQueue(1);
//        queue.enQueue(2);
//        queue.enQueue(3);
//        queue.traverse();
    }
}
