package HW10.model;

public abstract class MainBaseModel {
    String modelName;

    public MainBaseModel(String modelName) {
        this.modelName = modelName;
    }

    public abstract double getResult();
}
