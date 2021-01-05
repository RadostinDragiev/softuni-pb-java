package L02_Conditional_Statements_More_Exercises;

import java.util.Scanner;

public class P06Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysOff = Integer.parseInt(scanner.nextLine());
        int foodForTheAnimals = Integer.parseInt(scanner.nextLine());
        double dogFoodPerDay = Double.parseDouble(scanner.nextLine());
        double catsFoodPerDay = Double.parseDouble(scanner.nextLine());
        double turtleFoodPerDay = Double.parseDouble(scanner.nextLine()) / 1000;

        double totalFood = daysOff * (dogFoodPerDay + catsFoodPerDay + turtleFoodPerDay);

        if (totalFood <= foodForTheAnimals) {
            double leftFood = Math.floor(foodForTheAnimals - totalFood);
            System.out.printf("%.0f kilos of food left.", leftFood);
        } else if (totalFood > foodForTheAnimals){
            double neededFood = Math.ceil(totalFood - foodForTheAnimals);
            System.out.printf("%.0f more kilos of food are needed.", neededFood);
        }
    }
}
