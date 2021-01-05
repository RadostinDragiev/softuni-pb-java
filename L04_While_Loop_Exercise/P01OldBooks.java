package L04_While_Loop_Exercise;

import java.util.Scanner;

public class P01OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lookingForThisBook = scanner.nextLine();
        int libraryCapability = Integer.parseInt(scanner.nextLine());

        String currentBook = "";
        int libraryCounter = 0;
        boolean ifFound = false;

        while (libraryCounter < libraryCapability) {
            currentBook = scanner.nextLine();
            if (currentBook.equals(lookingForThisBook)) {
                ifFound = true;
                break;
            } else {
                libraryCounter++;
            }
        }

        if (ifFound) {
            System.out.printf("You checked %d books and found it.", libraryCounter);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", libraryCapability);
        }
    }
}
