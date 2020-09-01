import java.text.SimpleDateFormat;
import java.util.Date;

public class demo_date01 {
    public static void main(String[] args) {
        Date dnow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("当前时间:" + ft.format(dnow));
    }
}
