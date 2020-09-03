// 栈的实现
public class MyStack {
    private int maxSize;
    private long[] stackArray;
    private int top;
    // 构造方法
    public MyStack(int s){
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }
    // 入栈
    public void push(long j){
        stackArray[++top] = j;
    }
    // 出栈
    public long pop(){
        return stackArray[top--];
    }
    // 栈顶元素
    public long peek(){
        return stackArray[top];
    }
    // 栈空
    public boolean isEmpty(){
        return (top == -1);
    }
    // 栈满
    public boolean isFull(){
        return (top == maxSize-1);
    }

    // main
    public static void main(String[] args) {
        MyStack theStack = new MyStack(10);
        theStack.push(10);
        theStack.push(20);
        theStack.push(30);
        theStack.push(40);
        theStack.push(50);
        while (!theStack.isEmpty()){
            long value = theStack.pop();
            //long topValue = theStack.peek();
            System.out.print("value: ");
            System.out.print(value+" ");
            //System.out.print("topValue: "+topValue);
            System.out.print("isEmpty: "+theStack.isEmpty());
            System.out.println();
        }
        System.out.println("");
    }
}
