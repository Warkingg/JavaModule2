import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class NextDayCalculator {
    public static final DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        public static void main (String[]args) throws ParseException {
            System.out.println("dd-mm-yyyy");
            Scanner scanner = new Scanner(System.in);
            String date = scanner.nextLine();
            Date currentDate = new SimpleDateFormat("dd-MM-yyyy").parse(date);
            System.out.println(currentDate);
            // convert date to calendar
            Calendar c = Calendar.getInstance();
            c.setTime(currentDate);

            // manipulate date
            c.add(Calendar.YEAR, 0);
            c.add(Calendar.MONTH, 0);
            c.add(Calendar.DATE, 1); //same with c.add(Calendar.DAY_OF_MONTH, 1);
            c.add(Calendar.HOUR, 1);
            c.add(Calendar.MINUTE, 1);
            c.add(Calendar.SECOND, 1);

            // convert calendar to date
            Date currentDatePlusOne = c.getTime();
            System.out.println(dateFormat.format(currentDatePlusOne));

        }
    }




