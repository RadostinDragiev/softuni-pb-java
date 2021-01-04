package L01_Simple_Operations_And_Calculations_Lab;

import java.util.Scanner;

public class P05ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int projects = Integer.parseInt(scanner.nextLine());
        int hours = projects * 3;
        System.out.printf("The architect %s will need %d " +
                "hours to complete %d project/s.", name, hours, projects);
    }
}
