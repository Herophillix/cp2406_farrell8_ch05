import java.util.*;
import java.time.*;

public class PastPresentFuture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Day:");
        int day = scanner.nextInt();
        System.out.println("Month:");
        int month = scanner.nextInt();
        System.out.println("Year:");
        int year = scanner.nextInt();

        String inputDate = year + "-" + month + "-" + day;

        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int currentYear  = localDate.getYear();
        int currentMonth = localDate.getMonthValue();
        int currentDay   = localDate.getDayOfMonth();

        if(year != currentYear)
        {
            System.out.println(inputDate + " is not in " + currentYear);
        }
        if(month < currentMonth)
        {
            System.out.println(Month.of(month) + " is before " + Month.of(currentMonth));
        }
        else if(month > currentMonth)
        {
            System.out.println(Month.of(month) + " is after " + Month.of(currentMonth));
        }
        else
        {
            System.out.println(Month.of(month) + " is the same as " + Month.of(currentMonth));
        }
    }
}