package datecalendar;

import java.util.Calendar;
import java.util.Date;

public class JavaDate {
    public static void main(String[] args) {
        Date currentDate = new Date();
        Date randomDate = new Date(2021,11,11);
        System.out.println("Current time is : "+currentDate);

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
    }
}
