package HW10.model;

import HW10.utilites.MainConstants;

public class MainModelB extends MainBaseModel {
    double firstOption;
    double secondOption;

    public MainModelB(String modelName, double firstOption, double secondOption) {
        super(modelName);
        this.firstOption = firstOption;
        this.secondOption = secondOption;
    }

    @Override
    public double getResult() {
        return ((firstOption + secondOption) * MainConstants.RATE);
    }
}
