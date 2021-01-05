package L05_For_Loop_More_Exercises;

import java.util.Scanner;

public class P07FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double stadiumCapacity = Integer.parseInt(scanner.nextLine());
        int fansCount = Integer.parseInt(scanner.nextLine());

        double sectorAFans = 0;
        double sectorBFans = 0;
        double sectorVFans = 0;
        double sectorGFans = 0;

        for (int i = 0; i < fansCount; i++) {
            String sector = scanner.nextLine();

            switch (sector) {
                case "A": {
                    sectorAFans++;
                    break;
                }
                case "B": {
                    sectorBFans++;
                    break;
                }
                case "V": {
                    sectorVFans++;
                    break;
                }
                case "G": {
                    sectorGFans++;
                    break;
                }
            }
        }

        double sectorAPercent = sectorAFans / fansCount * 100;
        double sectorBPercent = sectorBFans / fansCount * 100;
        double sectorVPercent = sectorVFans / fansCount * 100;
        double sectorGPercent = sectorGFans / fansCount * 100;

        System.out.printf("%.2f%%%n", sectorAPercent);
        System.out.printf("%.2f%%%n", sectorBPercent);
        System.out.printf("%.2f%%%n", sectorVPercent);
        System.out.printf("%.2f%%%n", sectorGPercent);
        System.out.printf("%.2f%%", (fansCount / stadiumCapacity) * 100);
    }
}
