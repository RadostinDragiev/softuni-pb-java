package L02_Conditional_Statements_More_Exercises;

import java.util.Scanner;

public class P01PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int poolVolume = Integer.parseInt(scanner.nextLine());
        int firstPipeFlowPerHour = Integer.parseInt(scanner.nextLine());
        int secondPipeFlowPerHour = Integer.parseInt(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());

        double firstPipeTotalFlow = firstPipeFlowPerHour * hours;
        double secondPipeTotalFlow = secondPipeFlowPerHour * hours;
        double totalFlow = firstPipeTotalFlow + secondPipeTotalFlow;

        if (totalFlow <= poolVolume) {
        double poolFilled = totalFlow / poolVolume * 100;
        double firstPipe = firstPipeTotalFlow / totalFlow * 100;
        double secondPipe = secondPipeTotalFlow / totalFlow * 100;
            System.out.printf("The pool is %.2f%% full. " +
                    "Pipe 1: %.2f%%. Pipe 2: %.2f%%.", poolFilled, firstPipe, secondPipe);
        } else if (totalFlow > poolVolume) {
            double overflow = totalFlow - poolVolume;
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hours, overflow);
        }
    }
}
