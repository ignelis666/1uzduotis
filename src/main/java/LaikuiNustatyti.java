import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;



public class LaikuiNustatyti {

    public static String Uzpiso()
    {
        LocalDate test = new LocalDate("2019-03-11") ;
        String data = test.toString();
        return data;
    }

    public static Days daysToNewYear() {
        LocalDate myDay = LocalDate.now();
        LocalDate toDay = new LocalDate(Uzpiso());
        return Days.daysBetween(myDay, toDay);
    }

}




