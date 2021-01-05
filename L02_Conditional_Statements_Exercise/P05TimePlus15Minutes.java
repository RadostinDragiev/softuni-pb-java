package L02_Conditional_Statements_Exercise;

import java.util.Scanner;

public class P05TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        hours *= 60;

        int sum = hours + minutes;
        int totalHours = sum / 60;

        System.out.println(totalHours);


    }
}
