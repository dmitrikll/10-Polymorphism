package HW10v2.view;

import java.util.Scanner;
import java.util.Locale;

public class AppView {

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

    public double getFirstOption() {
        System.out.print("Enter value of the first option: ");
        scData.useLocale(Locale.ENGLISH);
        return scData.nextDouble();
    }

    public double getSecondOption() {
        System.out.print("Enter value of the second option: ");
        scData.useLocale(Locale.ENGLISH);
        return scData.nextDouble();
    }

    public void getOutput(String output) {
        scData.close();
        System.out.println(output);
    }
}
