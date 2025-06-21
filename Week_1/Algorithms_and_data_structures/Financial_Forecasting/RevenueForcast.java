package Algorithms_and_data_structures.Financial_Forecasting;

import java.util.*;

public class RevenueForcast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example: revenue for past 5 years
        double[] revenue = new double[5];
        System.out.println("Enter revenue for past 5 years:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Year " + (i + 1) + ": ");
            revenue[i] = scanner.nextDouble();
        }

        // Calculate average growth rate
        double totalGrowth = 0;
        for (int i = 1; i < 5; i++) {
            totalGrowth += (revenue[i] - revenue[i - 1]) / revenue[i - 1];
        }
        double avgGrowthRate = totalGrowth / 4;

        System.out.print("Enter years to forecast: ");
        int futureYears = scanner.nextInt();

        double currentRevenue = revenue[4];

        System.out.println("\nForecasted Revenue:");
        for (int i = 1; i <= futureYears; i++) {
            currentRevenue += currentRevenue * avgGrowthRate;
            System.out.printf("Year %d: $%.2f%n", 2025 + i, currentRevenue);
        }

        scanner.close();
    }
}