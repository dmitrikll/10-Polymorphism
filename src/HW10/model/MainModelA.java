package HW10.model;

public class MainModelA extends MainBaseModel {
    double firstOption;
    double secondOption;

    public MainModelA(String modelName, double firstOption, double secondOption) {
        super(modelName);
        this.firstOption = firstOption;
        this.secondOption = secondOption;
    }

    @Override
    public double getResult() {
        return (firstOption * secondOption);
    }
}