package L03_Nested_Conditional_Statements_More_Exercises;

import java.util.Scanner;

public class P02BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int juniorsCount = Integer.parseInt(scanner.nextLine());
        int seniorsCount = Integer.parseInt(scanner.nextLine());
        String raceType = scanner.nextLine();

        double juniorsParticipationFee = 0;
        double seniorsParticipationFee = 0;
        switch (raceType) {
            case "trail": {
                juniorsParticipationFee = juniorsCount * 5.5;
                seniorsParticipationFee = seniorsCount * 7;
                break;
            }
            case "cross-country": {
                juniorsParticipationFee = juniorsCount * 8;
                seniorsParticipationFee = seniorsCount * 9.5;
                break;
            }
            case "downhill": {
                juniorsParticipationFee = juniorsCount * 12.25;
                seniorsParticipationFee = seniorsCount * 13.75;
                break;
            }
            case "road": {
                juniorsParticipationFee = juniorsCount * 20;
                seniorsParticipationFee = seniorsCount * 21.50;
                break;
            }
        }

        double totalIncome = juniorsParticipationFee + seniorsParticipationFee;
        double totalParticipations = juniorsCount + seniorsCount;
        if (raceType.equals("cross-country") && totalParticipations >= 50) {
            totalIncome = totalIncome - (totalIncome * 0.25);
        }

        double raceCoasts = totalIncome * 0.05;
        double atTheEnd = totalIncome - raceCoasts;

//        System.out.println(totalIncome);
        System.out.printf("%.2f", atTheEnd);
    }
}
