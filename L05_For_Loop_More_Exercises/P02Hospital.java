package L05_For_Loop_More_Exercises;

import java.util.Scanner;

public class P02Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysToCount = Integer.parseInt(scanner.nextLine());

        int treatedPatients = 0;
        int unthreatedPatients = 0;
        int doctors = 7;

        for (int i = 1; i <= daysToCount; i++) {
            if (i % 3 == 0 && treatedPatients < unthreatedPatients) {
                doctors++;
            }

            int patientsPerDay = Integer.parseInt(scanner.nextLine());

            if (patientsPerDay >= doctors) {
                treatedPatients += doctors;
                unthreatedPatients += patientsPerDay - doctors;
            } else {
                treatedPatients +=patientsPerDay;
            }
        }

        System.out.printf("Treated patients: %d.%n", treatedPatients);
        System.out.printf("Untreated patients: %d.", unthreatedPatients);
    }
}
