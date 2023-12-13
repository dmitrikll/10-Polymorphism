package HW10.view;

import java.util.Scanner;
import java.util.Locale;

public class View {

    private final Scanner scData = new Scanner(System.in);

    public int getModel() {
        System.out.println("""
                Please, choose a model:
                1 - Model # A
                2 - Model # B
                """);
        scData.useLocale(Locale.ENGLISH);
        return scData.nextInt();
    }

    public double[] getOption() {
        System.out.print("Enter value of the first option: ");
        scData.useLocale(Locale.ENGLISH);
        double firstOption = scData.nextDouble();
        System.out.print("Enter value of the second option: ");
        scData.useLocale(Locale.ENGLISH);
        double secondOption = scData.nextDouble();
        return new double[]{firstOption, secondOption};
    }

    public void getOutput(String output) {
        scData.close();
        System.out.println(output);
    }
}
