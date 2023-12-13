package HW10.model;

import HW10.utilites.Constants;

public class ModelB extends BaseModel {
    double firstOption;
    double secondOption;

    public ModelB(String modelName, double firstOption, double secondOption) {
        super(modelName);
        this.firstOption = firstOption;
        this.secondOption = secondOption;
    }

    @Override
    public double getResult() {
        return ((firstOption + secondOption) * Constants.RATE);
    }
}
