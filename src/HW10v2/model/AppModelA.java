package HW10v2.model;

public class AppModelA extends AppBaseModel{

    @Override
    public double getResult(double firstOption, double secondOption) {
        return (firstOption * secondOption);
    }
}
