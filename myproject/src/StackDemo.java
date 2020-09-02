/* java  stack 栈 */
import java.util.*;
public class StackDemo {
    static void showpush(Stack<Integer> st,int a){
        // 入栈
        st.push(new Integer(a));
        System.out.println("push,"+a);
        System.out.println("stack,"+st);
    }
    static void showpop(Stack<Integer> st){
        // 出栈
        System.out.println("pop --->");
        Integer a = (Integer) st.pop();
        System.out.println(a);
        System.out.println("stack: " + st);
    }

    // 主函数
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        System.out.println("stack: " +st);
        showpush(st,42);
        showpush(st,85);
        System.out.println("栈顶元素："+st.peek());
        showpush(st,99);
        System.out.println("栈顶元素："+st.peek());
        System.out.println("99位置: "+st.search(99));
        showpop(st);
        showpop(st);
        showpop(st);
        System.out.println("栈空: "+st.empty());
        try{
            showpop(st);
        } catch (EmptyStackException e){
            System.out.println("empty stack");
        }
    }
}
