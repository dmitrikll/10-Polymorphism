package HW10.utilites;

import java.text.DecimalFormat;

public class MainRounder {

    public static String roundValue(double value) {
        return new DecimalFormat("#.00").format(value);
    }
}
