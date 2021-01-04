package L01_Simple_Operations_And_Calculations_Lab;

import java.util.Scanner;

public class P06PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogs = Integer.parseInt(scanner.nextLine());
        int anotherAnimals = Integer.parseInt(scanner.nextLine());
        double dogsFood = dogs * 2.5;
        int anotherAnimalsFood = anotherAnimals * 4;
        double sum = dogsFood + anotherAnimalsFood;
        System.out.printf("%.2f lv.", sum);
    }
}
