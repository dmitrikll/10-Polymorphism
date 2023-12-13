package HW10.controller;

import HW10.view.View;
import HW10.model.ModelA;
import HW10.model.ModelB;
import HW10.utilites.Rounder;

public class Controller {

    public static void getCalculate() {

        View view = new View();
        int modelType = view.getModel();
        double[] option = view.getOption();
        String modelName;
        double firstOption;
        double secondOption;
        String realisation;
        String output;

        switch (modelType) {
            case 1: {
                modelName = "Model # A";
                firstOption = option[0];
                secondOption = option[1];
                ModelA model = new ModelA(modelName, firstOption, secondOption);
                realisation = Rounder.roundValue(model.getResult());
                output = "Device is " + modelName + ";" +
                        "\nResult realisation is: " + realisation + ".";
                view.getOutput(output);
                break;
            }
            case 2: {
                modelName = "Model # B";
                firstOption = option[0];
                secondOption = option[1];
                ModelB model = new ModelB(modelName, firstOption, secondOption);
                realisation = Rounder.roundValue(model.getResult());
                output = "Device is " + modelName + ";" +
                        "\nResult realisation is: " + realisation + ".";
                view.getOutput(output);
                break;
            }
            default: {
                System.out.println("Sorry, model type is not available.");
            }
        }
    }
}
