package L02_Conditional_Statements_Exercise;

import java.util.Scanner;

public class P07WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double worldRecord = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double timeInSeconds = Double.parseDouble(scanner.nextLine());

        double distanceTime = distanceInMeters * timeInSeconds;
        double delay = Math.floor(distanceInMeters / 15) * 12.5;

        distanceTime += delay;

        if (distanceTime < worldRecord) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", distanceTime);
        } else {
            double difference = distanceTime - worldRecord;
            System.out.printf("No, he failed! He was %.2f seconds slower.", Math.abs(difference));
        }
    }
}
