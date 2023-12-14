package HW10v2.controller;

import HW10v2.view.AppView;
import HW10v2.model.AppModelA;
import HW10v2.model.AppModelB;
import HW10v2.utitlites.AppRounder;

public class AppController {

    public void GetCalculate() {

        AppView view = new AppView();
        int modelType = view.getModel();
        double firstOption = view.getFirstOption();
        double secondOption = view.getSecondOption();
        String modelName;
        String realisation;
        String output;

        if (modelType == 1) {
            modelName = "Model # A";
            AppModelA model = new AppModelA();
            realisation = AppRounder.roundValue(model.getResult(firstOption, secondOption));
            output = "Device is " + modelName + ";" +
                    "\nResult realisation is: " + realisation + ".";
            view.getOutput(output);
        } else if (modelType == 2) {
            modelName = "Model # B";
            AppModelB model = new AppModelB();
            realisation = AppRounder.roundValue(model.getResult(firstOption, secondOption));
            output = "Device is " + modelName + ";" +
                    "\nResult realisation is: " + realisation + ".";
            view.getOutput(output);
        } else {
            System.out.println("Sorry, model type is not available.");
        }
    }
}
