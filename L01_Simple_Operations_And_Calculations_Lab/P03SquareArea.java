package L01_Simple_Operations_And_Calculations_Lab;

import java.util.Scanner;

public class P03SquareArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int area = a * a;
        System.out.println(area);
    }
}
