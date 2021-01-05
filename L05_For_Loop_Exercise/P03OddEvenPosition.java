package L05_For_Loop_Exercise;

import java.util.Scanner;

public class P03OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int incomingNumbers = Integer.parseInt(scanner.nextLine());

        double maximum = 1000000000.0;
        double minimum = -1000000000.0;

        double oddSum = 0;
        double oddMin = maximum;
        double oddMax = minimum;
        double evenSum = 0;
        double evenMin = maximum;
        double evenMax = minimum;

        for (int position = 1; position <= incomingNumbers; position++) {
            double number = Double.parseDouble(scanner.nextLine());

            if (position % 2 == 0) {
                evenSum += number;
                if (number > evenMax) {
                    evenMax = number;
                }
                if (number < evenMin) {
                    evenMin = number;
                }
            } else {
                oddSum += number;
                if (number > oddMax) {
                    oddMax = number;
                }
                if (number < oddMin) {
                    oddMin = number;
                }
            }
        }

        boolean hadEvenCategoryChanged = !(evenMin == maximum && evenMax == minimum);
        boolean hasOddCategoryChanged = !(oddMin == maximum && oddMax == minimum);

        System.out.printf("OddSum=%.2f,%n", oddSum);
        System.out.println(hasOddCategoryChanged ? String.format("OddMin=%.2f,", oddMin) : "OddMin=No,");
        System.out.println(hasOddCategoryChanged ? String.format("OddMax=%.2f,", oddMax) : "OddMax=No,");
        System.out.printf("EvenSum=%.2f,%n", evenSum);
        System.out.println(hadEvenCategoryChanged ? String.format("EvenMin=%.2f,", evenMin) : "EvenMin=No,");
        System.out.println(hadEvenCategoryChanged ? String.format("EvenMax=%.2f", evenMax) : "EvenMax=No");
    }
}
