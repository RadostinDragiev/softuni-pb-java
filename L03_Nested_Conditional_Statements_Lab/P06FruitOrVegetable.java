package L03_Nested_Conditional_Statements_Lab;

import java.util.Scanner;

public class P06FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        //banana, apple, kiwi, cherry, lemon и grapes
        if (input.equals("banana")
                || input.equals("apple")
                || input.equals("kiwi")
                || input.equals("cherry")
                || input.equals("grapes")
                || input.equals("lemon")) {
            System.out.println("fruit");
        } else if (input.equals("tomato")
                || input.equals("cucumber")
                || input.equals("pepper")
                || input.equals("carrot")) {
            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
        }
    }
}
