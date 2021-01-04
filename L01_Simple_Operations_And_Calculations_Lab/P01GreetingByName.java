package L01_Simple_Operations_And_Calculations_Lab;

import java.util.Scanner;

public class P01GreetingByName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.printf("Hello, %s!", name);
    }
}
