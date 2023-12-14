package HW10v2.utitlites;

import java.text.DecimalFormat;

public class AppRounder {

    public static String roundValue(double value) {
        return new DecimalFormat("#.00").format(value);
    }
}
