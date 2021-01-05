package L02_Conditional_Statements_Lab;

import java.util.Scanner;

public class P06PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        String rightPassword = "s3cr3t!P@ssw0rd";

        if (password.equals(rightPassword)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
