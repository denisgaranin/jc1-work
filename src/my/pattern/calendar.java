package my.pattern;

import java.util.Calendar;
import java.util.Date;

public class calendar {

    public static void main(String[] args) {
        Date currentDate = new Date(Long.MAX_VALUE);
        System.out.println("Current date: " + currentDate);

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());

        OrderStatus initialStatus = OrderStatus.PAID;
        System.out.println(initialStatus.getPrice());
        System.out.println(initialStatus.name());
        System.out.println(initialStatus.ordinal());

    }
}