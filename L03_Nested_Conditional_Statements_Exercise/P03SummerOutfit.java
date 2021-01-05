package L03_Nested_Conditional_Statements_Exercise;

import java.util.Scanner;

public class P03SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dergrees = Integer.parseInt(scanner.nextLine());
        String timeOfTheDay = scanner.nextLine();

        if (dergrees >= 10 && dergrees <= 18) {
            switch (timeOfTheDay) {
                case "Morning":
                    System.out.printf("It's %d degrees, get your Sweatshirt and Sneakers.", dergrees);
                    break;
                case "Afternoon":
                case "Evening":
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.", dergrees);
                    break;
            }
        } else if (dergrees > 18 && dergrees <= 24) {
            switch (timeOfTheDay) {
                case "Morning":
                case "Evening":
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.", dergrees);
                    break;
                case "Afternoon":
                    System.out.printf("It's %d degrees, get your T-Shirt and Sandals.", dergrees);
            }
        } else {
            switch (timeOfTheDay) {
                case "Morning":
                    System.out.printf("It's %d degrees, get your T-Shirt and Sandals.", dergrees);
                    break;
                case "Afternoon":
                    System.out.printf("It's %d degrees, get your Swim Suit and Barefoot.", dergrees);
                    break;
                case "Evening":
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.", dergrees);
            }
        }
    }
}
