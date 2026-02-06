package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        // flag to take a non-leap year by default
        boolean is_leap_year = false;

        // If year is divisible by 4
        if (year % 4 == 0) {
            is_leap_year = true;

            // To identify whether it is a
            // century year or not
            if (year % 100 == 0) {
                // Checking if year is divisible by 400
                // therefore century leap year
                if (year % 400 == 0)
                    is_leap_year = true;
                else
                    is_leap_year = false;
            }
        }

        // We land here when corresponding if fails
        // If year is not divisible by 4
        else

            // Flag dealing-  Non leap-year
            is_leap_year = false;

        if (!is_leap_year)
            System.out.println("not leap");
        else
            System.out.println("leap");
    }
}
