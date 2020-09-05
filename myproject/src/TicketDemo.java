public class TicketDemo {
    public static void main(String[] args) {
        // create Thread obj
        Ticket ticket = new Ticket();
        // create window obj
        Thread t1 = new Thread(ticket,"窗口1");
        Thread t2 = new Thread(ticket,"窗口2");
        Thread t3 = new Thread(ticket,"窗口3");

        // syn sell ticket
        t1.start();
        t2.start();
        t3.start();
    }
}
