package HW10.controller;

import HW10.view.MainView;
import HW10.model.MainModelA;
import HW10.model.MainModelB;
import HW10.utilites.MainRounder;

public class MainController {

    public static void getCalculate() {

        MainView view = new MainView();
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
                MainModelA model = new MainModelA(modelName, firstOption, secondOption);
                realisation = MainRounder.roundValue(model.getResult());
                output = "Device is " + modelName + ";" +
                        "\nResult realisation is: " + realisation + ".";
                view.getOutput(output);
                break;
            }
            case 2: {
                modelName = "Model # B";
                firstOption = option[0];
                secondOption = option[1];
                MainModelB model = new MainModelB(modelName, firstOption, secondOption);
                realisation = MainRounder.roundValue(model.getResult());
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
