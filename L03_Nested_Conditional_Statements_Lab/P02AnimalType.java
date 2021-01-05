package L03_Nested_Conditional_Statements_Lab;

import java.util.Scanner;

public class P02AnimalType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String animal = scanner.nextLine();

        animal = animal.toLowerCase();

        switch (animal) {
            case "dog": {
                System.out.println("mammal");
                break;
            }
            case "crocodile":
            case "tortoise":
            case "snake": {
                System.out.println("reptile");
                break;
            }
            default: {
                System.out.println("unknown");
                break;
            }
        }
    }
}
