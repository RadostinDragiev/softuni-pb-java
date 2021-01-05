package L02_Conditional_Statements_Exercise;

import java.util.Scanner;

public class P02BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = Integer.parseInt(scanner.nextLine());
        double bonus = 0;

        if (score <= 100) {
            bonus = 5;
        } else if (score < 1000) {
            bonus = score * 0.20;
        } else {
            bonus = score * 0.10;
        }
        if (score % 2 == 0) {
            bonus += 1;
        } else if (bonus % 10 == 5) {
            bonus += 2;
        }

        System.out.println(bonus);
        System.out.println(score + bonus);
    }
}
