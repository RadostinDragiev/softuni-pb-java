package L02_Conditional_Statements_Exercise;

import java.util.Scanner;

public class P04MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double value = Double.parseDouble(scanner.nextLine());
        String inputMetric = scanner.nextLine();
        String outputMetric = scanner.nextLine();

        double metersMultiplier = 0; // Always in meters
        if (inputMetric.equalsIgnoreCase("mm")) {
            metersMultiplier = value / 1000.0;
        } else if (inputMetric.equalsIgnoreCase("cm")) {
            metersMultiplier = value / 100.0;
        } else if (inputMetric.equalsIgnoreCase("m")) {
            metersMultiplier = value;
        }

        double result = 0;
        if (outputMetric.equalsIgnoreCase("mm")) {
            result = metersMultiplier * 1000;
        } else if (outputMetric.equalsIgnoreCase("cm")) {
            result = metersMultiplier * 100;
        } else if (outputMetric.equalsIgnoreCase("m")) {
            result = metersMultiplier;
        }

        System.out.printf("%.3f", result);
    }
}


