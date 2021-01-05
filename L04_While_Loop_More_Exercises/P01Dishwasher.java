package L04_While_Loop_More_Exercises;

import java.util.Scanner;

public class P01Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int detergent = Integer.parseInt(scanner.nextLine()) * 750;

        int dishesOrPot = 0;
        int washedDishes = 0;
        int washedPots = 0;
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            int dishes = Integer.parseInt(input);

            if (dishesOrPot % 2 == 0 && dishesOrPot != 0) {
                washedPots += dishes;
                detergent -= dishes * 15;
                dishesOrPot = 0;
            } else {
                washedDishes += dishes;
                detergent -= dishes * 5;
                dishesOrPot++;
            }
            if (detergent < 0) {
                break;
            }
            input = scanner.nextLine();
        }

        if (detergent < 0) {
            System.out.printf("Not enough detergent, %d ml. more necessary! ", Math.abs(detergent));
        } else {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n", washedDishes, washedPots);
            System.out.printf("Leftover detergent %d ml.", detergent);
        }
    }
}
