package L03_Nested_Conditional_Statements_Lab;

import java.util.Scanner;

public class P09TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        double revenue = Double.parseDouble(scanner.nextLine());

        double tradeCommission = 0;
        boolean isError = false;

        if (town.equals("Sofia")) {
            if (revenue >= 0 && revenue <= 500) {
                tradeCommission = revenue  * 0.05;
            } else if (revenue > 500 && revenue <= 1000) {
                tradeCommission = revenue* 0.07;
            } else if (revenue > 1000 && revenue <= 10000) {
                tradeCommission = revenue * 0.08;
            } else if (revenue > 10000) {
                tradeCommission = revenue * 0.12;
            } else {
                isError = true;
            }
        } else if (town.equals("Varna")) {
            if (revenue >= 0 && revenue <= 500) {
                tradeCommission = revenue * 0.045;
            } else if (revenue > 500 && revenue <= 1000) {
                tradeCommission = revenue* 0.075;
            } else if (revenue > 1000 && revenue <= 10000) {
                tradeCommission = revenue * 0.10;
            } else if (revenue > 10000) {
                tradeCommission = revenue * 0.13;
            } else {
                isError = true;
            }
        } else if (town.equals("Plovdiv")) {
            if (revenue >= 0 && revenue <= 500) {
                tradeCommission = revenue * 0.055;
            } else if (revenue > 500 && revenue <= 1000) {
                tradeCommission = revenue * 0.08;
            } else if (revenue > 1000 && revenue <= 10000) {
                tradeCommission  = revenue * 0.12;
            } else if (revenue > 10000) {
                tradeCommission = revenue * 0.145;
            } else {
                isError = true;
            }
        } else {
            isError = true;
        }

        if (isError) {
            System.out.println("error");
        } else {
            System.out.printf("%.02f", tradeCommission);
        }
    }
}
