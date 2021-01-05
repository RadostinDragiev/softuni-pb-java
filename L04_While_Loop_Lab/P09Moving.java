package L04_While_Loop_Lab;

import java.util.Scanner;

public class P09Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int lenght = Integer.parseInt(scanner.nextLine());
        int hight = Integer.parseInt(scanner.nextLine());
        int houseVolume = width * lenght * hight;

        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            int boxCount = Integer.parseInt(input);
            houseVolume -= boxCount;
            if (houseVolume <= 0) {
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(houseVolume));
                break;
            }
            input = scanner.nextLine();
        }
        if (houseVolume > 0) {
            System.out.printf("%d Cubic meters left.", houseVolume);
        }
    }
}
