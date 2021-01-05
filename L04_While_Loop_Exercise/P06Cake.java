package L04_While_Loop_Exercise;

import java.util.Scanner;

public class P06Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int lenght = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int cakePieces = width * lenght;
        int piecesCounter = 0;
        while (!input.equals("STOP")) {
            int piecesTaken = Integer.parseInt(input);
            piecesCounter += piecesTaken;
            if (piecesCounter > cakePieces) {
                break;
            }
            input = scanner.nextLine();
        }

        int piecesLeft = 0;
        if (input.equals("STOP")) {
            piecesLeft = cakePieces - piecesCounter;
            System.out.printf("%d pieces are left.", piecesLeft);
        }
        if (piecesCounter > cakePieces) {
            piecesLeft = piecesCounter - cakePieces;
            System.out.printf("No more cake left! You need %d pieces more.", piecesLeft);
        }
    }
}
