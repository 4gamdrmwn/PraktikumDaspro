package Jobsheet11;

import java.util.Scanner;

public class SurveySatisfaction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 10 Respondents (Rows) x 6 Questions (Columns)
        int[][] survey = new int[10][6]; 
        
        System.out.println("=== SURVEY DATA INPUT (Scale 1-5) ===");
        for (int i = 0; i < survey.length; i++) { // Row Loop (Respondents)
            System.out.println("Input for Respondent #" + (i + 1) + ":");
            for (int j = 0; j < survey[i].length; j++) { // Column Loop (Questions)
                System.out.print("  Question #" + (j + 1) + ": ");
                survey[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("\n------------------------------------");
        System.out.println("          ANALYSIS RESULTS          ");
        System.out.println("------------------------------------");

        // CALCULATE AVERAGE PER RESPONDENT (ROW AVERAGE) ---
        System.out.println("\n1. Average Score per Respondent:");
        for (int i = 0; i < survey.length; i++) {
            double totalPerResp = 0;
            
            // Summing values in a single row
            for (int j = 0; j < survey[i].length; j++) {
                totalPerResp += survey[i][j];
            }
            
            // Calculate average: Total Row Value / Number of Columns (6)
            double avgResp = totalPerResp / survey[i].length;
            System.out.printf("   Respondent %d: %.2f\n", (i + 1), avgResp);
        }

        // --- CALCULATE AVERAGE PER QUESTION (COLUMN AVERAGE) ---
        // Calculating vertical average (per column)
        System.out.println("\n2. Average Score per Question:");
        for (int j = 0; j < survey[0].length; j++) {
            double totalPerQuest = 0;
            
            // Summing values in a single column (from all rows)
            for (int i = 0; i < survey.length; i++) {
                totalPerQuest += survey[i][j];
            }
            
            // Calculate average: Total Column Value / Number of Rows
            double avgQuest = totalPerQuest / survey.length;
            System.out.printf("   Question %d: %.2f\n", (j + 1), avgQuest);
        }

        // --- CALCULATE OVERALL AVERAGE ---
        double grandTotal = 0;
        int totalElements = 0;
        
        for (int i = 0; i < survey.length; i++) {
            for (int j = 0; j < survey[i].length; j++) {
                grandTotal += survey[i][j];
                totalElements++;
            }
        }
        
        double overallAvg = grandTotal / totalElements;
        System.out.println("\n3. Overall Average:");
        System.out.printf("   Total Average: %.2f\n", overallAvg);
        
        sc.close();
    }
}