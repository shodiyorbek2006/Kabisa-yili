package Calendar;

import java.time.LocalDate;
import java.time.Year;
import java.util.Calendar;
import java.util.Scanner;

import static java.lang.System.in;
import static java.util.Calendar.YEAR;

public class Kabisa$yili {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        Calendar calendar = Calendar.getInstance();
        System.out.print("yilni kiriting: ");
        int a = scanner.nextInt();
        calendar.set(Calendar.YEAR,a);
        System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_YEAR)>365);
    }
}
