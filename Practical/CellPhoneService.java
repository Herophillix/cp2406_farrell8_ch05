import java.util.*;

public class CellPhoneService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String planName = "";
        int price = 0;

        System.out.println("Input number of minutes of talk time:");
        int talkTime = scanner.nextInt();
        System.out.println("Input number of text messages:");
        int textMessage = scanner.nextInt();
        System.out.println("Input number of gigabytes of data:");
        int data = scanner.nextInt();

        if(data > 2)
        {
            planName = "F";
            price = 87;
        }
        else if (data > 0)
        {
            planName = "E";
            price = 79;
        }
        else if (talkTime > 500)
        {
            if(textMessage > 100)
            {
                planName = "D";
                price = 70;
            }
            else
            {
                planName = "C";
                price = 61;
            }
        }
        else
        {
            if(textMessage > 0)
            {
                planName = "B";
                price = 55;
            }
            else
            {
                planName = "A";
                price = 49;
            }
        }

        System.out.println("For " + talkTime + " minute(s) of talk time, " + textMessage + " message(s), " + data + " gigabyte(s) of data, we recommend plan "
                + planName + " with a price of $" + price + "/month");
    }
}