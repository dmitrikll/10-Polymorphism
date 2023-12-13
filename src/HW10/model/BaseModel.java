package HW10.model;

public abstract class BaseModel {
    String modelName;

    public BaseModel(String modelName) {
        this.modelName = modelName;
    }

    public abstract double getResult();
}
