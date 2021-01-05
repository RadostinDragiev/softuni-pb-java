package L05_For_Loop_Lab;

import java.util.Scanner;

public class P10NumbersFrom1ToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = number; i > 0; i -= 3) {
            System.out.println(i);
        }
    }
}
