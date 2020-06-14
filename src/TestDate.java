import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.*;

class TestDate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please fill a day (1-31) :");
        int day = sc.nextInt();
        System.out.println("Please fill a month (1-12) :");
        int month = sc.nextInt();
        System.out.println("Please fill a year :");
        int year = sc.nextInt();
        sc.close();

        // TODO : your code after this line


        try {
            /*
            Get day formated
             */
            SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
            String dateString = month+"-"+day+"-"+year;
            Date date = sdf.parse(dateString);
            String dateFormated = sdf.format(date);

            /*
             Get day of the week
            */
            Calendar c = Calendar.getInstance();
            c.setTime(date);
            int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

             /*
            Get print message
             */
            String message = "The date is : "+dateFormated+"\nThe day of week is : "+dayOfWeek;
            System.out.println(message);

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }



}