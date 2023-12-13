package HW10.model;

public class ModelA extends BaseModel {
    double firstOption;
    double secondOption;

    public ModelA(String modelName, double firstOption, double secondOption) {
        super(modelName);
        this.firstOption = firstOption;
        this.secondOption = secondOption;
    }

    @Override
    public double getResult() {
        return (firstOption * secondOption);
    }
}