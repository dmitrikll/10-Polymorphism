package HW10v2.model;

import HW10v2.utitlites.AppConstants;

public class AppModelB extends AppBaseModel {
    @Override
    public double getResult(double firstOption, double secondOption) {
        return ((firstOption + secondOption) * AppConstants.RATE);
    }
}
