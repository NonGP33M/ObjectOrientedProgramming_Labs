import java.util.*;

public class Pro2_64010683 {
    public static void main(String[] args) {
        GregorianCalendar currentTime = new GregorianCalendar();
        System.out.println("Current year, month, date, and day of week");
        display(currentTime);
        System.out.println("-----------");
        currentTime.add(GregorianCalendar.DATE, 1);
        System.out.println("After specified the elapsed time of one day after current day");
        display(currentTime);
        System.out.println(currentTime.getTime());

    }

    public static void display(GregorianCalendar currentTime) {
        System.out.println("Year is " + currentTime.get(GregorianCalendar.YEAR));
        System.out.println("Month is " + currentTime.get(GregorianCalendar.MONTH));
        System.out.println("Date is " + currentTime.get(GregorianCalendar.DATE));
        System.out.println("Day of week is " + currentTime.get(GregorianCalendar.DAY_OF_WEEK));

    }
}